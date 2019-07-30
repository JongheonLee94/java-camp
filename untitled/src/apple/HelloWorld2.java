package apple;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class HelloWorld2 extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("HelloWorld2");
        String theTime="";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","HR","HR");
            System.out.println(conn);
            Statement stmt = conn.createStatement();
            String sql = "SELECT SYSDATE FROM DUAL";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()){
               theTime = rs.getString(1);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            //에러가 난 정보를 역추적해서 출력해준다.
            e.printStackTrace();
        }

        PrintWriter out  = response.getWriter();

        out.println("<html>");
        out.println("   <body>");
        out.println("       HelloWorld2 : ^^*"  + theTime);
        out.println("   </body>");
        out.println("</html>");
        out.close();
    }
}
//
//javac -d C:\StudyHome\WEB-INF\classes -classpath servlet-api.jar HelloWorld2.java
// HelloWorld2.java
