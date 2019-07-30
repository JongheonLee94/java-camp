package soribada;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.net.Socket;

/*
소리바다 짜기 클라이언트가 서버쪽으로파일이름 보내고 있으면 다운 없으면 없다고 보내면 됨
client           server
소켓생성 -  소켓생성
output         input
input           output
"music.mp3"->
writeUTF      readUTF
               해당파일 있는지 조사
readInt()<- 잇으면 200writeInt()
when 404: 끝
when200:파일다운
 */

public class SoribadaC {
    public static void main(String[] args) throws IOException {
        String l = "장범준-3-노래방에서.mp3"; //args[0]
        int fileSize =0;
        String ip = "127.0.0.1";
        int port = 1123;
        Socket skt = new Socket(ip, port);
        ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
        out.writeUTF(l);
        out.flush();
        String l2 = in.readUTF();
        if (l2.equals("200")){
            System.out.println("다운로드를 시작합니다.");
            fileSize = in.readInt();
            BufferedInputStream fin =new BufferedInputStream(skt.getInputStream());
            OutputStream fout = new BufferedOutputStream(new FileOutputStream("music.mp3"));
            byte[] buf = new byte[1024*16];
            int r =0;
            int cur=0;
            while (( r = fin.read(buf) ) != -1){
                cur +=r;
                System.out.println( cur*100/fileSize+" %");
                fout.write(buf,0,r);
                fout.flush();
            }
            fin.close();
            fout.close();
        }
        else{
            System.out.println("파일을 찾지 못하였습니다.");

        }
        in.close();
        out.close();
        skt.close();

    }
}
/*


package soribada;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.net.Socket;

//
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

public class SoribadaC {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port =1123;
        Socket skt = new Socket(ip,port);
        InputStream in = new BufferedInputStream(skt.getInputStream());
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String l =br.readLine();
        l="장범준-3-노래방에서.mp3";
        PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
        out.println(l + "\n");
//        out.flush();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String data = reader.readLine();
        System.out.println(data);
        OutputStream out2 = new BufferedOutputStream(new FileOutputStream("music.mp3"));
        byte[] buf = new byte[1024*8];
        int r =0;
        while (( r = in.read(buf) ) != -1){
            System.out.println(r);
            out2.write(buf,0,r);
            out2.flush();
        }

        out.close();
        in.close();
        skt.close();


    }
}

 */