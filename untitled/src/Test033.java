class A4{
    private int mayak = 0;
    protected int monarisa = 0;
    public int house2 = 0;
}
class B4 extends A4{
    void print(){
        System.out.println(house2);
    }
}
public class Test033 {
    public static void main(String[] args) {
        A4 look = new A4();
        System.out.println(look.house2);
    }
}
/*
    look.monarisa 은 같은 패키지에서는 접근 가능. 다른 팩키지에서는 접근 불가.
    protected를 포수의 사인으로 이해하면 좋다.
    같은 팀의 다른 클래스에게는 알려지지만, 다른 팀에 소속된 클래스는 접근 불가해야 한다.
    후배에게 물려줄 때는 접근 가능해야 한다.

    (실전에서는 private / public 많이 쓴다.)
 */
