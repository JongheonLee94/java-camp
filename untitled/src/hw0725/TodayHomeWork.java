package hw0725;

import com.sun.security.ntlm.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class A implements Runnable {
    Socket skt = null;

    public A(Socket skt) {
        this.skt = skt;
    }

    @Override
    public void run() {
        try (
                ObjectInputStream in = new ObjectInputStream(skt.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(skt.getOutputStream());
        ) {
            String l = in.readUTF();

            File file =new File(l);
            if(file.exists()){
                out.writeUTF("200");
                out.flush();

                BufferedInputStream fin = new BufferedInputStream(new FileInputStream(l));
                BufferedOutputStream fout =new BufferedOutputStream(skt.getOutputStream());
                byte[] buf = new byte[1024*1];
                int r = 0;
                while ((r=fin.read(buf))!=-1){
                    fout.write(buf,0,r);
                    fout.flush();
                }
                fout.close();
                fin.close();
            }else{
                out.writeUTF("404");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            skt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class TodayHomeWork {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket svr = new ServerSocket(1123);
        Thread[] threads =new Thread[3];
        for (int i = 0; i < 3; i++) {
            Socket skt = svr.accept();
            System.out.println("연결" + skt.getInetAddress());


            threads[i]= new Thread(new A(skt));
            threads[i].start();
        }
        for (int i = 0; i < 3; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        svr.close();
        System.out.println("서버종료");
    }
}
