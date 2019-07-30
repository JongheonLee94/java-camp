package temp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test078 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("a.dat");
        out.write( 65 );
        out.write( 66 );
        out.write( 67 );
        out.close();
    }
}

/*
    FileOutputStream : 파일에 저장하는 방법을 제공한다.
    OutputStream : 내보내는 방법을 추상화 한 클래스
    ( 이걸 상속받은 클래스는 , 이걸로 가리킬 수 있고 , 이것에 선언된거만 쓴다.

    write : 한번에 1 바이트를 내보내는데 , 오버라이딩 도니 write 가 호출된다.
        (api 보니까) , 오버라이딩 된 write 는 매개변수의 값을
        a.dat 파일에 저장하게 된다.

    out.close(); - 내보내는 통로를 닫고 , 뒤처리를 해 준다,

    AppleOutputStream  extends OutputStream ...
    형태로 선언되어졌다고 셈 치면 , 인스턴스만 바꾸면 나머지는  바꿀 필요업다.
 */
