import java.io.*;

/*
=   OutputStreamWriter InputStreamReader 는 char 입출력을
        byte 입출력으로 전환해 줍니다.
    ( 220 qhfxmfmf 110 볼트로 바꾸듯 2byte 입출력을 1byte 로 바꿔준다.)
 */
public class Test087 {
    public static void main(String[] args) throws Exception{
        Writer out =  new OutputStreamWriter(new  FileOutputStream ("a.txt"));
        out.write('한');
        out.write('뷁');
        out.write('д');
        out.write('林');
        out.write('あ');
        out.close();

        Reader in =new InputStreamReader( new FileInputStream("a.txt"));
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        System.out.println( (char)in.read());
        in.close();

        //글자 하나를 넣고 뺄때


    }
}
