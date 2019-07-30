class Apple{
    int data;

    public Apple(int data) {
        this.data = data;
    }

    void print(){
        System.out.println(this.data);
    }
}

class PineApple extends Apple{

    void  print(){
        System.out.println("PineApple "+ data + " : " +this.pi);
    }
    float pi;

    public PineApple(int data) {
        super(data);
        this.pi = 3.14f;
    }

    int increase(int i){
        System.out.println(this.pi);
        return this.data +i;
    }

}
public class Temp04 {
    public static void main(String[] args) {
        Apple t;

        t=  new PineApple( 100 );
        t.print(  );

    }
}
