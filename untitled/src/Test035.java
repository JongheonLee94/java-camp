abstract class A6 { //abstract 메소드를 하나라도 가진다면 클래스 또한 abstract를 가져야한다.
    abstract public  void print();
}
abstract class B6 extends D6 { //abstract 메소드가 없더라도 abstract가 클래스에 붙어도 상관없다. abstract class 도 상속을 받을 수 있다.

}
class C6 extends B6{ //abstract class 를 상속받아 클래스를 만들수 있다.
}
class D6 {}
public class Test035 {
    public static void main(String[] args) {
        //new B6(); 추상 클래스는 인스턴스 생성불가
        A t = null; //참조형변수 선언가능
    }
}
/* 위의 print 함수는 선언되었지만 정의되지 않았다. 반드시 abstract 붙여준다.
	abstract 메소드를 하나라도 가진 클래스는 abstract 클래스라고 정의해야 한다.
	클래스는 3가지 인스턴스 생성 변수선언 상속이 가능하나,
	abstract class 는 인슽턴스를 못 만든다. 변수선언, 상속은 가능하다
*/


