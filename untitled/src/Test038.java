interface ICalc { //interface 언에는 전부 abstract여야함. 인터페이스도 일종의 abstract클래스이다.
    public void print();
}

interface IUnknown{}

class Apple5{}

abstract class Apple6 implements ICalc{

}
class Calc extends Apple5 implements ICalc, IUnknown{//인터페이스를 상속해서 클래스를 선언할 때에는 implements를 이용해야 한다.
    public void print() {
        System.out.println("A");
    }

}
public class Test038 {
    public static void main(String[] args) {
        ICalc ic =new Calc();
        ic.print();
    }
}
/*
    인터페이스에 선언된 method는 몽땅 abstract 해야 한다.
    인터페이스를 상속해서 클래스를 선언할 때에는 implements를 이용해야 한다.
    상속받은 클래스는 인터페이스에 선언된 메소드를 몽땅 오버라이딩 해야 한다.
    인터페이스는 일종의 abstract 클래스이다. -변수선언, 상속당함 가능, 인스턴스생성불가

    2개 이상의 인터페이스 상속 OK, 동시에 클래스 1개 상속? OK
 */