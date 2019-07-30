class A8{
    int i= 100;
}
class B8 extends A8{
    int i = 200;
    public void print(){
        System.out.println(i);
    }
}
public class Test041 {
    public static void main(String[] args) {
        A8 t = new B8();
        System.out.println( t.i); //A의 i
//        t.print(); 안됨
        // t 포인터가 가리키는 인스턴스를 감싸는 B 클래스 인스턴스를 t2가 가리킨다.
        B8 t2 = (B8)t;
        System.out.println( t2.i); //B의 i가 나온다. 캐스팅을 하면 값이 달라지기 때문에 조상에서 사용한 변수는 사용하지 않는 것이 좋다.
        t2.print();
        System.out.println(t2.i);
    }
}
