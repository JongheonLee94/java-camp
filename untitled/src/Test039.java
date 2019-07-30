interface IGreet {
    public String greet();
}

class MerciGreet implements IGreet {
    public MerciGreet() {
        System.out.println(this);
    }

    public String greet() { return "Merci"; }
}

class HelloGreet implements IGreet {
    public HelloGreet() {
        System.out.println(this);
    }

    public String greet() { return "Hello"; }
}

abstract class GreetDeco implements IGreet{
    protected IGreet ig = null;
    GreetDeco( IGreet i){
        ig= i;
    }

}
// 자손의 생성자에서 조상의 생성자 중 매개변수 있는 생성자를 호출 원하면 super 로 지정.
class SharpDeco extends GreetDeco{
    public SharpDeco(IGreet i) { //조상의 생성자의 매개변수가 있을 경우 자손에서 반드시 지정해줘야한다.
        super(i);

        System.out.println(this);
    }
    public String greet(){
        System.out.println("sharpDeco's greet"); return "#" + ig.greet()+"#";}
}

class StarDeco extends GreetDeco{
    public StarDeco(IGreet i) { //조상의 생성자의 매개변수가 있을 경우 자손에서 반드시 지정해줘야한다.
        super(i);

        System.out.println(this);
    }
    public String greet(){System.out.println("starDeco's greet"); return "*" + ig.greet()+"*";}
}

public class Test039 {
    public static void main(String[] args) {
        IGreet ig = new SharpDeco(new StarDeco( new StarDeco(new HelloGreet())));
        System.out.println(ig.greet());
    }
}
