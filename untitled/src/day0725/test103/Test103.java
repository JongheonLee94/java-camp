package day0725.test103;

import java.sql.*;

public class Test103 {
    /*
        executeUpdate 상황엣 에러나도 conn.close() 는 되어야 한다? ㅇㅇ
        finally 영역은 try 영역에서 에러가 나건 안나건 무조건 실향한다.
        :stmt.close() conn.close() 를 finally 로 옮김.
        : 변수선언 정리
        getConnection() 에서 에러나면? conn 과 stmt 는 null 인 채로 finally 행
        그러면 stmt.close()가 참조형변수가 null이므로 메소드를 실행할 수 없어 에러가남
        stmt.close() conn.close() 가 stmt , conn 이 null 이 아닐때만
            호출하도록 개선했다.
            : 프로젝트 때 마르고 닳도록 쓸거다
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        addGul("HelloApple");

    }

    private static void addGul(String gul) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE", "HR", "HR");

            stmt = conn.createStatement();
            String sql = "insert into bangmyung_t values (seq_bangmyung.nextval,'" + gul + "' , sysdate)";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("all closesd");
        }


    }
/*
       함수로 선언해서 재사용성을 높였다.
       SQL 문장에서 에러 -> stmt.executeUpdate(sql) 에서 예외발생
       -> conn.close() 실행 안된다. -> 이건 좀 크다  (conn 은 빨리 끊어야)

    private static void addGul(String gul) throws ClassNotFoundException, SQLException {

        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE", "HR", "HR");

        Statement stmt = conn.createStatement();
        String sql = "insert into bangmyung_t values (seq_bangmyung.nextval,'" + gul + "' , sysdate)";
        stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
    }
*/
}

