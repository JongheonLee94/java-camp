class Apple3{
    int data = 0;
    // return 문장이 없는 함수를 서브루틴이라 한다. 리턴타입을 void 로 선언한다.
    // 멤버함수 안에서 자신이 소속된 인스턴스에 대한 포인터를 사용가능 : this (참조형 변수)
    void print(){
        System.out.println( this.data );
    }
}
    //두 개의인스턴스가 있을 때 print를 할 경우 this로 불러오는 경우 각각의 객체를 가리킨다. t의 this는 t를 l의 this는 l을
    //this는 c로 짤 경우 매개변수(로컬변수)로 짠다.
    //print메소드는 메모리에 저장이 되어있고, 포인터만이 인스턴스에만 있다. 즉 t의 print도 l의 print도 둘 다 똑같은 print코드를 가리킨다.

    //오늘 과제 : 나눠준 temp04.c 파일을 분석해서 java 와 비교해서 리포트 작성.
    //함수 하나의 길이가 크다고 해서 인스턴스를 많이 생성하면 메모리에 부담가나 ? No... Why? ->temp04.c 분석

public class Test028 {
    public static void main(String[] args) {
        Apple3 t = new Apple3();
        t.data =10;
        t.print();

        Apple3 l = new Apple3();
        l.data= 20;
        l.print();
    }
}
