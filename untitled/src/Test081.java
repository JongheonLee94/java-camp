import java.io.*; //공부할 때 귀찮으면 이렇게

public class Test081 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\A\\jdk-6u30-apidocs.zip");
        OutputStream out = new FileOutputStream("C:\\A\\b.zip");
        long start = System.currentTimeMillis();
        //엄청 많이 씀 : 외우시오
        /*
            in read(byte[]
            -buf

         */
        int r = 0;
        byte[] buf = new byte[1024*32];

        while (( r = in.read(buf) ) != -1){
            out.write( buf, 0, r );
        }

        out.close();
        in.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
