
public class Test055 {
    public static void main(String[] args) {
        Integer i = 100; //1.4버젼까지는 에러가 났었다. 원칙적으로는 참조형변수가 자료값을 받는 게됨
        Object t = 200;
        System.out.println(i.getClass().getName());
        System.out.println(t.getClass().getName());

        int j = i ;
        System.out.println(j);
//        int k = t;
    }
}
/*
    Integer i = 100; 는 컴파일러가 Integer i = new Integer(100); 로 자동바꿈
    값을 래퍼클래스에 대입하는 코드는 자동으로 인스턴스 생성해서 값을 감싸준다.
    --이것을 Auto Boxing 이라고 한다.

    Object t = 200; Object 형 변수에 대해서도 AutoBoxing 은 동작한다.

    int j = i; 는 int j = i.intValue() 로 자동 변환하여 준다. ( Unboxing 이라 함)
    int k = t;는 안된다. Object 타입으로 오토박싱된 인스턴스는 언박싱 안된다.
        ( t.intValue() 를 호출할 수 없다. )
 */
