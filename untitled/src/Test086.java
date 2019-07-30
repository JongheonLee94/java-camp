import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
    OutputStreadm InputStream : 전송단위 byte : 바이너리 파일전송용
    Reader Writer : 전송단위 char :문자로 된 데이터 전송용

    char 는 2바이트고, 유니코드를 지원한다.
    유니코드는 모든 글자를 다 포용하지 못한다. (6만자 제한)
    -웬만한 글자는 포용한다. 한글 + 영문 + 중국어 + 아랍어 + 일본어 ...

    황장가능한 가변길이를 가지는 문자체제를 도입 : UTF-8(웹 표준)

 */
public class Test086 {
    public static void main(String[] args) throws Exception{
        Writer out =  new FileWriter("a.txt");
        out.write('한');
        out.write('뷁');
        out.write('д');
        out.write('林');
        out.write('あ');
        out.close();

        Reader in =new FileReader("a.txt");
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        in.close();

        //글자 하나를 넣고 뺄때


    }
}
