package study2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld3 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (false) {
            String date = "";
            List<BangMyungVO> ls = new ArrayList<BangMyungVO>();

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "HR", "HR");
                Statement stmt = conn.createStatement();
            /*
                TABLE => class
                FIELD => propety
                Record => instance
             */
                String sql = "SELECT no,gul,the_time FROM bangmyung_t";
                ResultSet rs = stmt.executeQuery(sql);
                response.setContentType("text/html;charset=euc-kr");
                while (rs.next()) {
                    BangMyungVO vo = new BangMyungVO();
                    vo.setNo(rs.getInt("no"));
                    vo.setGul(rs.getString("gul"));
                    vo.setTheTime(rs.getString("the_time"));
                    ls.add(vo);

                }

                rs.close();
                stmt.close();
                conn.close();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }


            System.out.println("HelloWorld3");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("   <body>");
            out.println("       <table border =\"0\" cellspacing = \"2\" cellpadding = \"12\">");


            for (BangMyungVO t : ls) {
                out.println("           <tr bgcolor=\"#eebbcc\">");
                out.println("               <td>");

                out.println(t.getNo());
                out.println("               </td><td>");
                out.println(t.getGul());
                out.println("               </td><td>");
                out.println(t.getTheTime());
                out.println("               </td>");
                out.println("           </tr>");
            }
            out.println("       </table>");
            out.println("   </body>");
            out.println("</html>");
            out.close();
        }else {
            System.out.println("구구단");
            PrintWriter out = response.getWriter();
            String gugu = "";

            out.println("<html>");
            out.println("   <body>");
            out.println("   <table>");

            for (int i = 1; i < 11; i++) {
                    out.println("       <tr>");
                for (int j = 1; j < 11; j++) {
                    String r= Integer.toHexString((int)(Math.random()*255));
                    String g= Integer.toHexString((int)(Math.random()*255));
                    String b= Integer.toHexString((int)(Math.random()*255));
                    out.println("           <td bgColor =\"" +r+g+b+"\">" + j + "x" + i + "= " + i * j + "</td>");
                }
                out.println("\n");
                out.println("       </tr>");
            }
            out.println("   </table>");
            out.println("   </body>");
            out.println("</html>");
            out.close();

        }
    }
}
