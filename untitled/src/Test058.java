public class Test058 {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("버퍼시작");
        sb.append("apple ");
        sb.append("banana ");
        String l = sb.toString();
        System.out.println(l);

    }
}
//"apple"+"banana" 는 컴파일러가 new StringBuffer().append("apple")
//  ,append("banana").toString();
/*
    아래 코드는 한 줄마다 new StringBuffer()가 동작해야 한ㄴ다.
    헌데 위의 main 의 예제는 하나의 StringBuffer 만 사용한다.
    : 메인 함수의 코드가 메모리 효율상 훨씬 좋다.

    String l = ""
    l=l+"*";
    l=l+"*";
    l=l+"*";
    ...
 */
