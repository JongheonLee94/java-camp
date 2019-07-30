import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*

 */
public class Test083S {
    public static void main(String[] args) throws IOException {
        ServerSocket svr = new ServerSocket(1123);
        System.out.println("Before accept");
        Socket skt = svr.accept();
        System.out.println("After accept");
        System.out.println(skt.getInetAddress());
//        InputStream in = skt.getInputStream();
//        int r = in.read();
//
//        in.close();
//        System.out.println(r);


        InputStream in = new FileInputStream("a.dat");
        OutputStream out = skt.getOutputStream();
        byte[] buf = new byte[1024 * 8];
        int r= 0;
        while (( r = in.read(buf) ) != -1){
            out.write(buf, 0 , r );
            out.flush();
        }
        out.close();
        in.close();
        skt.close();
        svr.close();
    }
}

//================================================================
/*
    대기하는 쪽 : 서버 , 찾아가는 쪽 : 클라이언트
    먼저 서버가 구동한다. - 포트를 물고 구동해야한다.(1123)
    accept : 대기하다가 믈라이언트가 찾아오면 소켓을 생성해서 리턴.

    클라이언트가 찾아가기 위해 ? IP, Port 번호
     잘찾아거 자면  socket이 생성된다
     접속성공시 양쪽에서는 Socket 이 생성되고 이 둘은 통신이 가능하다.
*/
/*
public class Test083S {
    public static void main(String[] args) throws IOException {
        ServerSocket svr = new ServerSocket(1123);
        System.out.println("Before accept");
        Socket skt =svr.accept();
        System.out.println("After accept");
        System.out.println(skt.getInetAddress());

        skt.close();

        svr.close();
    }
}
*/
//====================================================================commit 1
//
//import java.io.FileInputStream;
//        import java.io.IOException;
//        import java.io.InputStream;
//        import java.net.ServerSocket;
//        import java.net.Socket;

/*

 */
//public class Test083S {
//    public static void main(String[] args) throws IOException {
//        ServerSocket svr = new ServerSocket(1123);
//        System.out.println("Before accept");
//        Socket skt =svr.accept();
//        System.out.println("After accept");
//        System.out.println(skt.getInetAddress());
//
//        InputStream in = skt.getInputStream();
//        int r = in.read();
//
//        in.close();
//        System.out.println(r);
//        skt.close();
//
//        svr.close();
//    }
//}
//================================================================commit 2