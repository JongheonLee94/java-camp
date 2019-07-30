package chat;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatS{

    public static void main(String[] args) throws IOException {
        ServerSocket svr = new ServerSocket(1123);
        Socket[] skts =new Socket[10];
        int user_count=0;
        Thread chat = new Chat();
        chat.start();
        while (true){
        skts[user_count] = svr.accept();
            System.out.print(skts[user_count].getInetAddress());
        user_count++;
            System.out.println("connected");
        }
    }
}
