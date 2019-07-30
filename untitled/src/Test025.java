class Banana{
    int i=0;
    int add (int i, int j){return 100;}
    /*
    리턴타입이 없고, 클래스명과 함수명이 동일하면 생성자 함수이다.
    (Constructor) - 함수라고 보기는 좀 어렵다. (포인터로 호출 x)
    안스턴스 생성 시점에 호출되고,
    주용도가 인스턴스 내부의 변수의 초기값을 줄 때 사용된다.
     */
    Banana( int j ){
    }
}

public class Test025 {
    public static void main(String[] args) {
        Banana t = new Banana(100);
        System.out.println(t.i+t.add(10,20));
    }
}
