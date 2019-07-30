class Temp4{

}
/*
    조상클래스를 지정하지 않으면 Object 로 부터 상속받는다.
    java 에서는 기본적으로 제공되는 클래스들이 많은데 ...
        java.lang 패키지에 소속된 클래스는 import 없이 사용가능하다.
        (가장 기본적인 클래스 모음 , 막 가져다 써도 된단 얘기)

    toString() 은 Object 에 선언되었고 , 상속되었다. 알 수 있는 이유 Temp4에 선언하지도 않은 메소드가 호출가능 상속받은 Object에 있을것
    Temp4@4554617c : 클래스명@해시코드값 (인스턴스가 다르면 숫자값 다름)

    - Object 는 모든 클래스의 조상이 된다? Yes
    - Object 형 변수는 어떤 인스턴스라도 가리킬 수 있다? Yes
 */
public class Test048 {
    public static void main(String[] args) {
        Object t = new Temp4();
        System.out.println( t.toString() );
        Object t1 = new Temp4();
        System.out.println( t1.toString() );

    }
}
