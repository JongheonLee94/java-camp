/*
    객체지향의 언어의 3대 속성
    1.상속성 : 클래슬 상속해서 클래스 만든다.
    2.은닉성 : 감추고 싶으건 감출 수 있다. 쓰지 못하게 하고 싶은 건 쓰지 못하게
    3.다형성 : 하나의 심볼(이름)이 여러 실체에 매핑될 수 있다.
 */
class A {
    int apple = 10;
}

// 클래스 B는 클래스 A를 상속하여 만들어졌음을 명시함.
//      A에서 선언한 멤버변수 멤버함수를 내려받겠다. (물려받겠다 ) ...
class B extends A {
    int add(int i, int j) {
        return 100;
    }
}

public class Test027 {
    public static void main(String[] args) {
        B t = new B();
        System.out.println(t.apple);
    }
}
/*Q 에러 안나는 이유를 설명하시오 - A라는 클래스를 선언했고 그 뒤 B가 A를 상속받아 클래스를 만들었다.
	그리고 그 B클래스를 참조형변수 t가 클래스 B를 new하여 만든 instance를 가리켰기 때문에 t.apple이라는 변수에 접근이 가능하다.
	B가 A를 상속했기 때문에 A가 가진 멤버변수를 가진다.

*/
//클래스로 할 수 있는 3가지 : 참조형 변수 선언, 인스턴스 생성 , 상속받아 클래스 선언