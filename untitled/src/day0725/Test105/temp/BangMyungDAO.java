package day0725.Test105.temp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// 컴파일하기
/*
    폴더구조가
    .
    temp
    Test105.java
    BangMyungVO.java
    BangMyungDAO.java
    ojdbc14.jar

    ...
    이 경우
    1. 쓰임을 당하는 BangMyungVO.java부터 컴파일  package temp;
    javac -d .  BangMyungVO.java
    2.package temp;
    javac -d .  BangMyungDAO.java
    3. import temp.BangMyungDAO; import temp.BangMyungVO;
    javac Test105.java
     +
 */
public class BangMyungDAO { //Data Access Object

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static List<BangMyungVO> findAll() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<BangMyungVO> ls = new ArrayList<BangMyungVO>();
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE", "HR", "HR");
            stmt = conn.createStatement();
            String sql = "select * from bangmyung_t";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                BangMyungVO vo = new BangMyungVO();
                vo.setNo(rs.getInt("no"));
                vo.setGul(rs.getString("gul"));
                vo.setTheTime(rs.getString("the_time"));
                ls.add(vo);
            }
        } catch (SQLException e) {
            throw e;  //에러 나면 잡고 finall 거치고 다시 발생
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
            System.out.println("All closed");
        }


        return ls;
    }
    public static void addGul(String gul) throws ClassNotFoundException, SQLException {
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

}
