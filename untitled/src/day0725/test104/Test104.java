package day0725.test104;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class BangMyungVO {
    private Integer no = null;
    private String gul = null;
    private String theTime = null;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getGul() {
        return gul;
    }

    public void setGul(String gul) {
        this.gul = gul;
    }

    public String getTheTime() {
        return theTime;
    }

    public void setTheTime(String theTime) {
        this.theTime = theTime;
    }
}

public class Test104 {
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

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        List<BangMyungVO> ls2 = findAll();
        for (BangMyungVO t : ls2) {
            System.out.println(t.getNo() + t.getGul() + t.getTheTime());
        }
    }
}
