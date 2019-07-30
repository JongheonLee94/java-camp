class A5{
    private int data = 100;

    public int getData(){return data;}
}
class B5 extends A5{
    private int data = 200;

    @Override
    public int getData() {
        return data;
    }
}
public class Test034 {
    public static void main(String[] args) {
        A5 t = new B5();
//        System.out.println(t.data);
        System.out.println(t.getData()); //자손의 data 가 출력된다.
    }
}
/*
    멤버변수는 무조건 private 하게 선언한다,
    값을 읽고자 할 때는 getter 함수를 이용하여 접근한다.
    -A t = new B() 에서 t.i 는 조상의 값, t.print() 는 오버라이딩 된 게 나오고...
    이런 일이 벌어지지 않게 되더라 ...
    에티켓
    *조상에서 getXXX 가 보이걸랑 그런 변수가 있는 줄 알고 xXX 변수는 피해간다.
 */
