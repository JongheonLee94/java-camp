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

public class BangMyungList extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            String date = "";
            List<BangMyungVO> ls = new ArrayList<BangMyungVO>();

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "HR", "HR");
                Statement stmt = conn.createStatement();
            /*
                TABLE => class
                FIELD => propety
                Record => instance
             */
                String sql = "SELECT no,gul,the_time FROM bangmyung_t";
                ResultSet rs = stmt.executeQuery(sql);
                res.setContentType("text/html;charset=euc-kr");
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
            PrintWriter out = res.getWriter();
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


            out.println("<form method=\"POST\" action=\"bangmyung_add2\">\n" +
                    "    <input type=\"text\" size =50/><input type=\"submit\"/>\n" +
                    "</form>\n");
            out.println("   </body>");
            out.println("</html>");
            out.close();
    }
}
