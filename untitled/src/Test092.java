import java.io.InputStream;

public class Test092 {
    public static void main(String[] args) {
        String l = "HelloWolrd";
        String r = "HelloWolrd";
        String t = l.substring(2,5); //Stringpull에 들어갔다는 보자이 있다.

        /*
            ""로 생성한 String 은 Pool 을 쓴다. 포인터 비교가 가능
             그 이외의 경우 (substring 등등) 은 pool 쓴다는 보장이 없다.
             - 그 때는 equals 로 비교한다.
         */
        System.out.println(l==r ); //true
        System.out.println("llo" == t ); //false
        System.out.println("llo".equals( t) ); //true 풀에 들어가지 않은 것 같은 건 전부 equals로

        //문자열을 숫자로 변환시에 : Double.parseDouble()있음
        int r2 = Integer.parseInt("100");
        System.out.println(r2 == 100);  //true

        // , 하나 정도 있는 경우에는 이 방법이 낫다.
        String tl = "10101,100";
        int idx = tl.indexOf(",");
        System.out.println(tl.substring(0,idx));
        System.out.println(tl.substring(idx+1));

        // , 가 여러개 있는 경우에는 이 방법이 편하다.
        String [] ls =tl.split(",");
        System.out.println(ls[0]);
        System.out.println(ls[1]);
    }
}
