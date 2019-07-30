package filedown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test099 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); //클래스를 이름으로 찾아 로딩시키는 것 이 떄 staticInitializer가 호출
        /*
            connection 은 mysql 에 소켓으로 접속하는 것과 관계 깊음
            study : 데이터베이스 명
            root / 1111 계정과 암호

            127.0.0.1 : 로컬호스트 네트워크 카드 밖으로 나가지 않고 나에게 접속할 때 랜카드없어도 됨
         */
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC/study","root","1111");
        System.out.println(conn.toString());
        conn.close();
    }
}
// C:\JavaWork\mysql-connector-java-5.0.8-bin.jar
// jar 파일은 클래스 파일을 압축해서 배포하는 파일
// java -classpath .;mysql-connector-java-5.0.8-bin.jar Test099

/*
    -classpath 매번 안 잡아줘도  되는 방법
    C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext
 */