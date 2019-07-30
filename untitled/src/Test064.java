import temp.Test064A; //다른 패키지 안에 클래스를 사용하고 싶으면

public class Test064 {
    public static void main(String[] args) {
        Test064A t =null;
    }
}
/*
    다른 패키지의 클래스는 반드시 명시해야 사용할 수 있다. (import)
	javac -classpath C:\temp\ Test064.java
	java -classpath .;C:\ Test064		 실행할 때 양쪽패스를 다 넣어줘야한다. 앞에 .은 현재디렉토리의 Test064.class 를 찾고 ;뒤에 C:\에 있는 것을 찾는데 temp.Test064A로 되어 있으니 두개를 합쳐 경로가 C:\temp\Test064A.class가 된다.
    java -classpath new;C:\ Test064 cmd는 .고 .\new 위치에 Test064클래스가 있는경우
    만일 그래도 클래스를 못 찾으면, 클래스의 위치를 지정해 주어야 한다.
 */



