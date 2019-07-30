class Temp3{
    int i = 100;
    static void print(){
//        System.out.println(i);
    }
}
public class Test043 {
    public static void main(String[] args) {
        Temp3.print();
    }
}
/*
    static 멤버는 클래스명.심볼 형태로 접근.(인스턴스 생성전에 존재)
    static 멤버 함수 안에서는 non-static 한 멤버함수 멤버변수에
        접근할 수 없다 . (위의 i 의 경우 ) - 왜? static 멤버 함수인 print가 메모리에 올라오면서 할당되고 i는 non-static 멤버이기 때문에 인스턴스가 생성되기 전이라 오류가난다.
 */

/*
class instance 로컬변수 멤버변수 참조형 변수 자료형 변수 생성자함수
...
extends implements interface abstract abstract class abstract_method
overridding overloading 자료형변수_캐스팅 참조형변수_캐스팅
*/
