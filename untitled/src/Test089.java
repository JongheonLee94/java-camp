import java.io.*;
public class Test089 {
    public static void main(String[] args) {
        File f = new File("src\\Test089.java");
        boolean b = f.exists(); //파일 있나?
        System.out.println(b);

        if(b){
            //파일 길이를 리턴한다. (long 형 자료에 주의)
            System.out.println(f.length());
        }
    }

}
