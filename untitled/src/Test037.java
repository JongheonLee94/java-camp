abstract class Bank {
    abstract public double calc(double money, int years,double rate);
    public void print(){
        double r =calc(100, 100, 0.66);
        System.out.println(r);
    }
}

class BokriBank extends Bank{
    @Override
    public double calc(double money, int years, double rate) {
        return 59665.1234*subCalc();
    }
    private int subCalc(){return 1;} //서브로 계산을 해야줘야했다 가정
}
class DanriBank extends Bank{

    @Override
    public double calc(double money, int years, double rate) {
        return 760.0+money();
    }

    private int money(){return  100;}
}

public class Test037 {
    public static void main(String[] args) {
        Bank bk = new DanriBank();
        bk.print();

    }
}
