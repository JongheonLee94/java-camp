class Temp6{
    private Object data = null;

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }
}

/*
    String : new 없이 ""로 인스턴스가 생성이 가능한 클래스
    참조형 변수의 비교는 동일한 인스턴스를 가리킬 때 true ( 동일한 null 도 true)

    l== t 이 true 가 나온다? l 과 t는 동일한 인스턴스를 가리킨다.
    StringPool 이라는 독특한 java의 구조가 나온다..

    ""를 만나면 VM 운 Stringpool 을 뒤져서 없으면 만들고, 있으면 재활용
    -웹 프로그래밍에 매우 유용하다. HTML 내용을  Srtring 으로 만들고
        재활용하는 쪽이 메모리 관리에 유용허다

 */
public class Test050 {
    public static void main(String[] args) {
        String l = "Helloworld";  //참조형변수임 이유 기본자료형 8개 안에 없었다.
        String t = "Helloworld";  //참조형변수임 이유 기본자료형 8개 안에 없었다.

        System.out.println(l==t);  //인스턴스 비교시 같은 인스턴스이어야 true

        Object o = "HelloWorld";
        String r =  (String)o;  //이런거 시험에 나옴

    }
}
