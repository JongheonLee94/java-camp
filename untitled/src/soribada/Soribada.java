package soribada;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Soribada {

//소리바다 짜기 클라이언트가 서버쪽으로파일이름 보내고 있으면 다운 없으면 없다고 보내면 됨
//client           server
//소켓생성 -  소켓생성
//output         input
//input           output
//"music.mp3"->
//writeUTF      readUTF
//               해당파일 있는지 조사
//readInt()<- 잇으면 200writeInt()
//when 404: 끝
//when200:파일다운
//

    public static void main(String[] args) throws IOException {
        String path = "";
        ServerSocket svr = new ServerSocket(1123);
        Socket skt = svr.accept();
        String status = "";
        System.out.println("연결" + skt.getInetAddress());


        ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
        String fileName = in.readUTF();
        System.out.println(fileName);

        File file = new File(path + fileName);
        if (file.exists()) {
            status = "200";

        } else {
            status = "400";
        }
        out.writeUTF(status);
        out.flush();
        if (status.equals("200")){
            out.writeInt((int) file.length()); //다운로드 파일크기넘김
            out.flush();
            BufferedInputStream fin =new BufferedInputStream(new FileInputStream(path+fileName));
            BufferedOutputStream fout = new BufferedOutputStream(skt.getOutputStream());
            byte[] buf = new byte[1024 * 16];
            int r = 0;
            while ((r = fin.read(buf)) != -1) {
                System.out.println(r);
                fout.write(buf, 0, r);
                fout.flush();
            }
            fin.close();
            fout.close();
        }
        out.close();
        in.close();
        skt.close();
        svr.close();
    }

}

/*
package soribada;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Soribada {

//소리바다 짜기 클라이언트가 서버쪽으로파일이름 보내고 있으면 다운 없으면 없다고 보내면 됨
//client           server
//소켓생성 -  소켓생성
//output         input
//input           output
//"music.mp3"->
//writeUTF      readUTF
//               해당파일 있는지 조사
//readInt()<- 잇으면 200writeInt()
//when 404: 끝
//when200:파일다운
//

    public static void main(String[] args) throws IOException {
        ServerSocket svr = new ServerSocket(1123);
        System.out.println("Before accept");
        Socket skt = svr.accept();
        System.out.println("After accept");


        System.out.println(skt.getInetAddress());

        BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        String data = reader.readLine();
        System.out.println(data);


        File f = new File(data);
        boolean b = f.exists(); //파일 있나?
        System.out.println(b);
        InputStream in = null;
        OutputStream out2 = null;
        PrintWriter out = null;
        if (b) {
            //파일 길이를 리턴한다. (long 형 자료에 주의)
            out = new PrintWriter(skt.getOutputStream(), true);
            out.println("200" + "\n");
            System.out.println("200" + f.length());
            in = new FileInputStream(data);
            out2 = new BufferedOutputStream(skt.getOutputStream());
            byte[] buf = new byte[1024 * 8];
            int r = 0;
            while ((r = in.read(buf)) != -1) {
                System.out.println(r);
                out2.write(buf, 0, r);
                out2.flush();
            }
        } else {

            System.out.println(404);
        }

        out.close();
        out2.close();
        in.close();
        reader.close();
        skt.close();
        svr.close();
    }

}


 */