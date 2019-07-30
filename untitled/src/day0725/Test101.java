package day0725;

import java.sql.*;

public class Test101 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");  //기본으로 포함되지 않음
        // 그래서 java -classpath .;ojdbc14.jar Test101    로 해야함
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR", "HR");
        Statement stmt = conn.createStatement();

        String gul="HelloWolrd^^*";
        String sql = "insert into bangmyung_t values(seq_bangmyung.nextval, '"+ gul  +"', sysdate)";
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}
