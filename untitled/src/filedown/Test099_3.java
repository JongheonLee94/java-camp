package filedown;

import java.sql.*;

public class Test099_3 {
    static {
        //클래스가 로딩되는 시점에 호출
        /*
            Connection , Statement 모두 인터페이스이다.
            DriverMAnager.getConnecion 안에서는 Connection 을 상속받은
                모종의 클래스의 인스턴스를 리턴한다.
                그것은 Mysql 에 접속할 수 있는 기능을 구현하고 있다.

            그 모종의 클래스를 세팅하는 코드가
            Class.forName("com.mysql.jdbc.Driver");         */
        System.out.println("클래스로딩");
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=UTF-8&serverTimezone=UTC", "root", "1111"); //Connection 인터페잇
        System.out.println(conn.getClass().getName());

        Statement stmt = conn.createStatement();  //Statement 인터페이스

        /*
            ResultSet 은 CURSOR ( select 결과 ) 에 접근 가능한 정보
            CURSOR 는 서버에 생긴다.

            Connection 이 닫힌 다음에서는 ResultSet 은 사용 불가하다.
            ( Connection 닫기 전에 사용 끝나야 한다.)

            Connection 은 대단히 비싼자원이고 제한적이다.
            접속후에 빨리 끊어주는 게 바람직하다. (콜센터를 연상하면 된다.)

         */
        String sql = "select * from studentt";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            String stid = rs.getString("stid");
            String name = rs.getString("name");
            String addr = rs.getString("addr");

            System.out.println(stid + "\t" +name +"\t" +addr);
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
/*resultSet은 서버 사이드 커서 커서는 전진은 가능하나 후진불가

 */
