class A9{

}
class B9 extends A9{
    public void print(){
        System.out.println(100);
    }
}
public class Test062 {
    public static void main(String[] args) {
        A9 t = new B9();
//        t.print();    조상클래스에 print가 없어서 호출불가

        B9 t2 = (B9)t;
        t2.print();

        // 참조형변수 instanceof 클래스명 (B)t 이것이 가능하면 true/ 아니면 false
        A9 t3 = new A9();
        //t 가 가리키는 인스턴스를 감싸는 B 인스턴스 영역이 존재해야만 가능
        if( t3 instanceof B9){
            B9 t4 = (B9)t3;  // 존재하지 않는 인스턴스를 가리키기 때문에 에러가 난다.java.lang.ClassCastException: A9 cannot be cast to B9
            t4.print();
        }

    }
}
