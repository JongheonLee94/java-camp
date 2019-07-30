import java.lang.reflect.Method;
public class Test066_3{
    public static void main(String[] args) throws Exception{


        Class<?> cls = Class.forName("temp.Test066A");
        Object obj = cls.newInstance();
        /*
            Method 는 c의 함수포인터의 역할을 한다.
            cls.getMethods() : 모든 멤버함수의 포인터를 넘긴다.
            cls.getMethod(...) : 단 하나의 멤버함수의 포인터를 넘긴다.
                ... 에는 함수이름 , 매개변수의 형태를 명시한다.
         */
//        Method mtd =  cls.getMethod(" print ");
        Method mtd =  cls.getMethod("print2",int.class); // print2는 메소드 이름 뒤에 int.class는 매개변수
        System.out.println( mtd); //자동으로 toString();

        //mtd.invoke(obj,20); obj 돌릴 인스턴스  20은 매개변수   스태틱의 경우 cls를 넣어주어야함
        Object r = mtd.invoke(obj, 20);   //오토박싱함 리턴타입이 Object고
        System.out.println(((Integer)r).intValue() );
    }
}
//javac Test066.java
//java -classpath .;C:\A\ Test066  줘야 에러 안남
// javac -d C:\A\ Test066A.java
//Test066A.class 위치는 C:\A\temp\Test066A.class