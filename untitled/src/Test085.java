import java.io.*;

public class Test085 {
    public static void main(String[] args) throws IOException {
        /*
        데코레이터 패턴으로 이해하면 out 이 가리키는 대상은
            FileOutputStram(d.dat)에 저장화되
            ObjectOutputStream 에서 제옹하는 방법을 사용하게 된다.

            ObjectOutputStream 은 writeInt writeDouble writeUF 등을 wprhd
            -얀깨진다.

         */
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d.dat")); //코딩용글씨 쓰면 좋은점 길이가 다른 것으로 오타 찾을 수 있음
        out.writeInt(10101);
        out.writeUTF("오늘 저녁 뭐를 먹나?");
        out.writeInt(10102);
        out.writeInt(10103);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("d.dat"));
        int a = in.readInt();
        String e = in.readUTF();
        int b = in.readInt();
        int c = in.readInt();
        in.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);

    }
}
/*
        OutputStream out = new FileOutputStream("d.dat"); //코딩용글씨 쓰면 좋은점 길이가 다른 것으로 오타 찾을 수 있음
        out.write(10101);
        out.write(10102);
        out.write(10103);
        out.close();

        InputStream in = new FileInputStream("d.dat");
        int a = in.read();
        int b = in.read();
        int c = in.read();
        int d = in.read();
        in.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
 */