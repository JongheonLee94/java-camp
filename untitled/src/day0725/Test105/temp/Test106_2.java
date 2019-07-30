package day0725.Test105.temp;

import java.sql.*;

/*
    conn 을 통해서 executeUdate 하면 LOG를 거쳐서 Table 에 저장된다.
    jdbc 는 autoCommit 을 지원한다.
    (즉 executeUpdate 시에 무조건 commit 이 자동으로 먹는다 )

    conn.setAutoCommit( false ) : commit 이 자동으로 먹지 않는다
 */
public class Test106_2 {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR", "HR");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into test_tx  values ( 101 )");
            stmt.executeUpdate("insert into test_tx values ( 102 )");
            stmt.executeUpdate("insert into test_tx values ( 103 )");
            stmt.executeUpdate("insert into test_txa values ( 104 )");
            //제대로 됐으니 커밋
            conn.commit();         //로그를 테이블에 반영시키고 비운다.
        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();    //로그를 그냥 비운다.
            }
            throw e;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }


    }
}
/*
    insert into test_xt values ( 100 );

 */