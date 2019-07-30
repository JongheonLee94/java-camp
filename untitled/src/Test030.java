class A1{
    A1(){System.out.println("A constructor");}

}

class B1 extends A{
    B1(){System.out.println("B constructor");}

}

public class Test030{
    public static void main( String[] args ) {
        new B1(); //A생성자가 먼저 호출되고 B의 생성자가 호출된다.
    }
}
/* -상속 관계가 존재할 때 ( 조상클래스 , 자손클래스) 자손의 인스턴스를 생성하면 
	조상의 생성자가 먼저 호출되고, 자손의 생성자가 호출된다.

    -생성자는 상속되지 않는다. 다만 호출될 뿐이다. 맴버함수도 아니다.
     (참조형 변수로 호출할 수 없다.)

     인스턴스 B를 만들때 생성자가 두 번 호출되는 것이지(A생성자 B생성자) 인스턴스가 두개 만들어지는 것이 아니다.

*/