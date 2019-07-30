package day0725;
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

public class Test102 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE", "HR", "HR");

        Statement stmt = conn.createStatement();

        String sql = "select * from bangmyung_t";
        ResultSet rs = stmt.executeQuery(sql);
        List<BangMyungVO> ls= new ArrayList<BangMyungVO>();
        while (rs.next()) {
            BangMyungVO vo = new BangMyungVO();
            vo.setNo(rs.getInt("no"));
            vo.setGul(rs.getString("gul"));
            vo.setTheTime(rs.getString("the_time"));
            ls.add(vo);
        }
        for(BangMyungVO t : ls){
            System.out.println(t.getNo() + t.getGul() + t.getTheTime());
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
