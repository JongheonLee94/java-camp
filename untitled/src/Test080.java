import java.io.*; //공부할 때 귀찮으면 이렇게

public class Test080 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("a.dat");
        OutputStream out = new FileOutputStream("b.dat");

        //복사 : dir *.dat로 확인하고 type b.dat로 확인
        int r;
        while (true){
            r= in.read();
            System.out.println(r);
            if( r ==-1){
                System.out.println(r);
                break;
            }
            out.write(r);
        }

        out.close();
        in.close();
    }
}
