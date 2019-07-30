import java.lang.reflect.Method;
public class Test066_2{
    public static void main(String[] args) throws Exception{


        Class<?> cls = Class.forName("temp.Test066A");
        Object obj = cls.newInstance();

        /*
            getMethods() : 클래스 안에서 선언된 함수에 대한 포인터들을 추출한다.
         */
        Method[] mtds =  cls.getMethods();
        for (int i = 0; i < mtds.length; i++) {
            System.out.println(mtds[i]);
        }
    }
}
//javac Test066.java
//java -classpath .;C:\A\ Test066  줘야 에러 안남
// javac -d C:\A\ Test066A.java
//Test066A.class 위치는 C:\A\temp\Test066A.class