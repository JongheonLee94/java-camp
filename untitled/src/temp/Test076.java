/*	package  -import - class 선언식으로
	javac -d . Test065.java
	java -classpath . temp.Test076
	import 의 단위는 클래스다
	import 는 언제하냐? 다른클래스 가져다 쓸 때
	왜 try catch 안 쓰면 에러가 나나?
	 :throws XXXException 형태로 선언된 함수는 XXXException이 깐깐한 경우에 해당 예외를 처리할 수 있는 try catch 영역 안에서 사용해야 한다.

	 FileNotFoundException 을 IOException으로 고쳐도 될까
	 -돤다고 함 이유 IOException 이 조상클래스라서

	 commit 5
	 1.에러는 발생시에 잡아주면 에러 발생 안된걸로 한다.(일사부재리)
	 2.에러가 발생할 수 있으면 그 사실을 명시하면 된다.
	 (아래 경우는 생성자 호출한 쪽이 아니라 main 을 호출한 쪽이 처리한다.
	 사원이 사고치는데 대리는 그책임을 부장에게 넘기고 부장이 처리한다.)
*/
package temp;
import java.io.IOException;
import java.io.OutputStream;//다른 패키지의 클래스르 사용하기 위해서는 import 해야 함, import는 클래스 단위로 함
import java.io.FileOutputStream;// import 의 단위는 클래스 단위로 함

public class Test076 {
    public static void main( String[] args) throws  IOException{ //명시하면 에러 x main을 호출한 쪽에서 책임을 짐
            OutputStream out = new FileOutputStream("a.dat");
            //발생된 에러를 잡으면 프로그램이 죽지 않는다.


    }
}
