package filedown;

import java.sql.*;

/*
    클라우드에서 ojdbc14.jar 파일다운 : 작업폴더에 복사

    Mysql 의 코드와 거의 틀린 점이 없다.
    Connection , Statement 를 상속한 Oracle 과 연동 가능한 클래스를
        OracleDriver에서 DriverMAanager 에  세팅해주면
        Oracle 에 맞추어 개발된 , Connecion Statement ResultSet 등을
        상속받은 클래스가 공급되는 구죄앋.
 */
public class Test100 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
        System.out.println( conn.getClass().getName());
        Statement stmt = conn.createStatement();

        // 현재시간 - mysql 은 now() , oracle 은 sysdate
        String sql = "Select SYSDATE FROM DUAL";
        ResultSet rs = stmt.executeQuery(sql);
        //결과가 1개인 경우 while 보단 if가 더 좋음
        if (rs.next()){
            //필드명 대신에 숫자 가능 1은  나열된 첫번째 필드를 의미
            String l = rs.getString(1);
            System.out.println(l);
        }
        rs.close();

        stmt.close();
        conn.close();
    }
}
// java -classpath .;ojdbc14.jar Test100