package filedown;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
    property 는 멤버변수를 이야기함
    헌데 멤버변수는 getter/ setter 를 이용하고 private 하게 선언
 */
class StudentVO {
    private String stId = null;
    private String name = null;
    private String addr = null;

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

public class Test099_4 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=UTF-8&serverTimezone=UTC", "root", "1111"); //Connection 인터페잇
        System.out.println(conn.getClass().getName());

        Statement stmt = conn.createStatement();  //Statement 인터페이스

        /* O-R Mapping 규칙 (Golden Rule, Rule Of Thumb)
            field -> property
            table -> class
            record - > instance

            왜 ArrayList 가 적당할까?
            -계속 쌓기만 하므로 array List가 빠르다.

            Connection 은 살아있을 때 할 거 다해야한다.
            Connection 은 빨리 끊어야한다.
            이 두가지 조건을 아래 코드는 이상적으롷 구현하고 있다.

            Vo : ValueObject 의 약자 - 값을 담는 객체
            -테이블 구조와 동일하게 , 레코드 하나를 인스턴스에 담을 수 있는 역할

            DTO Data Tranfer Object
            Entity 등을 사용하는 경우도 있는데 실은 다 같은 얘기

         */
        List<StudentVO> rl = new ArrayList<StudentVO>();

        String sql = "select * from studentt";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            StudentVO vo = new StudentVO();
            vo.setStId(rs.getString("stid"));
            vo.setName(rs.getString("name"));
            vo.setAddr(rs.getString("addr"));
            rl.add(vo);
        }
        // -------------------------------------------------------------------------
        //conn.close() 이후에도 List 안에는 결과가 담겨 있다.
        for (StudentVO vo : rl) {
            System.out.println(vo.getStId() + "\t" + vo.getName() + "\t" + vo.getAddr());
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}

