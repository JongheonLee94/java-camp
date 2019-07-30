package study2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormTestServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("FormTestServlet");

        /*
            request : 요청과 관련되어진 함수 모음
            response : 등답과 관련되어진 함수가 모여있다.

            sendRedirect - 브라우저에게 해당경로로 요청할 것을 지시한다.
            getParameter - form에서 문자열과 name을 비교해서 찾아 그 값을 가져온다

            checkbox 는 체크후에 넘기면 value 에 지정된 값이 읽혀지고
            체크 없이 넘기면 null 값을 읽게 된다.
         */

        String gul = req.getParameter("gul");
        System.out.println("gul:" + gul);

        String abcd = req.getParameter("abcd");
        String xyzz = req.getParameter("xyzz");
        System.out.println("abcd: "+abcd);
        System.out.println("xyzz: "+xyzz);

        String method = req.getParameter("method");
        System.out.println("method: " +method);

        String pwd = req.getParameter("pwd");
        System.out.println("pwd: " +pwd);

        String content = req.getParameter("content");
        System.out.println("content: " +content);

        String fruit = req.getParameter("fruit");
        System.out.println("fruit: " +fruit);


        res.sendRedirect("/study2/test_02.html");


    }
}
