package temp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;


public class Test077 {
    public static void main(String[] args) throws IOException {// 메인을 호출한 쪽에서 책임을 지게 하는데 JVM 은 죽는 걸로 책임짐
           try {
               OutputStream out = new FileOutputStream("a.dat");

           }catch (IOException e)
           {
               throw e;
           }

    }
}
/*
    Tet076복습하기
 */
