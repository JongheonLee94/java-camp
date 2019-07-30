import java.io.*;

public class Test084 {
    public static void main(String[] args) throws IOException {
        long start =System.currentTimeMillis();
        /*
            IGreet ig = new SharpDeco(new HelloGreet());
            ig.greet();    => #Hello#
            -이전에 배웠던 데코레이터 패턴 예제

            out.write(..) 호출했을때 대상은 FileOutoutStream 에서 지정한다.
                BufferedOutoutStream 에서 버퍼링을 제공한다.
            -두 클래스가 결합한 결과를 만드는데 사용자는 OutputStream 에서
            지정한 함수만 사용하면 된다.

            :아 두개는 실제로 같은 설계기법으로 구현된 코드이다.
            java의 io패키지는 전부 데코레이터 패턴으로 만들어졌다.
         */
        InputStream in = new BufferedInputStream(new FileInputStream("C:\\A\\VSCodeUserSetup-x64-1.36.1.exe"));
        OutputStream out = new BufferedOutputStream(new FileOutputStream("c.dat"));
        int r=0;
        while ((r =in.read())!=-1){
            out.write(r);
        }

        in.close();
        out.close();
        long end =System.currentTimeMillis();
        System.out.println(end- start);
    }
}
/*
    java.io 패키지가 데코레이터 패턴이라는 설계기법으로 구현되었다.
    -HellloGreet MerciGreet StarDeco SharpDeco : 데코레이터 패턴의 예제

    1바이트씩 복사하는 코드를 짜세요
    BufferedInputStream 은 데코레이터 패턴으로 버퍼를 이용해 빠르게 해준다.
*/