package filedown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test099_2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=UTF-8&serverTimezone=UTC", "root", "1111");
        /*
            Statement 는 conn 줄을 타고 오가는 바구니를 연상하면 된ㄴ다.

            excuteUpdate 함수의 리턴값은 변경된 레코드의 갯수이다.
            select 는 레코드를 변경하지 않는다.
            해서 executeUpdate 는 insert / delete / update 문장에 사용한다.

            conn.close() 신중하개 해야 한다. (줄 끊는거다)
            stmt.close() 도 신중하게 ( 바구니 내리는 거 )

            conn 형성 - stmt 형성 - 작업 - stmt.close() - conn.close()
            이 순서를 지켜서 작업한다.
         */

        Statement stmt = conn.createStatement();
        System.out.println(stmt);
        String sql = "insert into studentt values('10107', '또오치', '쌍문동')";
        String sql2 = "delete from studentt where name = '또오치'";
        String sql3 = "update studentt set addr = '이도동' where stid='10101'";
        int rc = stmt.executeUpdate(sql2);  //리턴 변경한 레코드 수 excuteUpdate는 select문에 사용하지 않는다.
        System.out.println(rc);
        stmt.close();
        conn.close();
    }
}


//}
//public class Test099_2 {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver"); //클래스를 이름으로 찾아 로딩시키는 것 이 떄 staticInitializer가 호출
//
//        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC/study","root","1111");
//        Statement stmt = conn.createStatement();
//        String sql = "insert into studentt values ('10107' , '또오치 ', '쌍문동')";
//        String sql2 = "delete from studentt where stid = '10107'";
//        String sql3 = "update studentt set addr = '이도동' where stid ='10101'";
//        System.out.println(stmt);
//        stmt.close();
//        conn.close();
//    }
//}

