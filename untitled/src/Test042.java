class Temp2{
    static int i = 100;
}
 public class Test042 {
     public static void main(String[] args) {
         int j = Temp2.i;
     }//java 는 컴파일하면 같은 파일안에 class 가 있어도 클래스별로 파일을 나눠준다.
 }
//static 한 변수는 class 가 메모리 올라올 때 메모리 할당을 받아 생성된다.
 //실행순서 main 메소드를 포함한 class 가 메모리로 와서 실행 추후 필요한 class 를 불러온다.
/*
    자바 실행환경은 클래스가 필요해지면 .class 파일을 메모리에 올린다.
        그 후에 인스턴스 생성이 가능하다.

    static 멤버는 클래스 로딩시에 메모리에 할당받는다. 무조건 유일하다. +클래스는 최초에 한번만 올라간다. ->그렇기 때문에 static 멤버는 1개만 존재한다.
            (인스턴스가 몇개이건 간에)
    non-static 멤버는 인스턴스가 생성될 때 할당되고 인스턴스마다 따로따로 존재.
 */
