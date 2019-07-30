package test2;
import test.A;
interface ICalc { //interface 언에는 전부 abstract여야함. 인터페이스도 일종의 abstract클래스이다.
    int i = 10;
    public void print();
}
class D implements ICalc{

    @Override
    public void print() {

        System.out.println(i);
    }
}
class E extends D{

    int i;
    public void print2(){
        System.out.println("2");
    }
}

public class C {
    public static void main(String[] args) {
        A a  = new A();
        D d = new D();
        d.print();
        D d2 = new E();
        E e = (E) d2;
        e.print2();


    }
}
