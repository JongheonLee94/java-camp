import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
public class Test082 {
    public static void main(String[] args) throws IOException {
        Socket skt = new Socket("192.168.2.73",1123);

        // OutputStream 으로 상속받은 뭔가를 생성하고 리턴. out 이 가리킴
        OutputStream out = skt.getOutputStream();
        out.write(65);
        out.flush();
        out.close();

        skt.close();

    }
}

//===============================================================
//import java.io.IOException;
//        import java.net.Socket;
//public class Test082 {
//    public static void main(String[] args) throws IOException {
//        Socket skt = new Socket("192.168.2.73",1123);
//        skt.close();
//
//    }
//}
//=================================================================commit 1
