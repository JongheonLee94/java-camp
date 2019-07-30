abstract class A7{
    abstract public void print();
}
class B7 extends A7{
    public void print(){
        System.out.print(100);
    }
}
public class Test036 {
    public static void main(String[] args) {
        A7 t = new B7();
        t.print();
    }
}
/*
    abstract 메소드를 오버라이딩 하면 abstract 성질이 없어지게 된다.
    A t ? 가능 new B()? 가능  A t =  new B() ? 가능  t.print() ? 가능 오버라이딩된게 호출
    1.추상화클래스도 변수생성가능
    2.클래스는 인스턴스 생성가능
    3.조상클래스의 참조형변수는 자손의 인스턴스를 가리킬 수 있다.
    4.조상클래스의 참조형변수는 조상클래스의 정의된 메소드를 호출할 수 있다. 그리고 자손클래스가 오버라이딩한경우에는 오버라이딩된 메소드를 호출한다.
 */
