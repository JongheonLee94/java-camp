import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
    in.read() 는 오버라이딩 된 코드일까?아니면 InputSteam 에서 선언된걸까?
    -코드를 읽는 눈이 있어야 한다.

    in.read() : 한 바이트씩 읽어들이는 역할
    더 이상 읽을 것이 없을 떼 -1이 나온다.

    Stream (input/ output )개념
    -byte 단위로 전송한다.
    -순서대로 읽고 순서대로 내보낸다.
    -중간부분만 따로 읽고 내보내는 건 없다. 무조건 처음부터 끝까지!
    -다 썻으면 반드시 close 는 호출해 주어야 한다.
 */
public class Test079 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("a.dat");
        int a = in.read();
        int b = in.read();
        int c = in.read();
        int d = in.read();

        in.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
