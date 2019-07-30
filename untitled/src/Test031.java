class A2{
    public A2() {

        System.out.println( "A");
    }

    int a=2;
    void print(){ System.out.println("A print");}
}
class B2 extends A2{
    public B2() {
        System.out.println( "B");
    }

    void print(){
        int b= 1;
        System.out.println( "B print");
        //물려받은 자손쪽에서 물려받은 함수를 호출하고 싶을 때 super 를 이용한다.
        super.print();
    }
}
public class Test031 {
    public static void main(String[] args) {
        A2 a = (A2) new B2();
        a.print();
        System.out.println(a.a);

        B2 t = new B2();
        t.print();
        A2 t2 = new A2();
        t2.print();
    }
}
/*
    method overridding : 조상에서 선언한 멤버함수를 자손에서 다시 선언할 수 있다.
    : 자손의 인스턴스의 print 를 호출되면 (조상? 자손? ) 자손

    상속? 생성자? 영향있다.
    조상의 메소드와 같은 이름으로 자손쪽에서 메소드 선언가능
    자손인스턴스로 동명 메소드는 자손의 메소드가 호출된다,
    이 경우 조상 클래스의 메소드를 사용하고 싶다면 super 를 이용하면된다.
 */