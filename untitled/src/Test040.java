class Temp{
    public void print(){
        System.out.println(1);
    }
    public void print( int i ){
        System.out.println(i);
    }
    public void print( double i){
        System.out.println(i);
    }
    public void print( int i , int j){
        System.out.println("i: "+i+" j: "+j);
    }

}
/*
    하나의 클래스 안에 이름은 같은데 매개변수 형태가 틀린 함수가 여러개 공존가능
    -method overloading

    딱 매개변수가 맞지 않으면 가장 가깝게 자동 형변환 되는 것을 찾아서 호출한다.
 */
public class Test040 {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.print();

        //float j = (float) 3.14; //실수형의 대표 double 정수형의 대표는 int 이다. 따라서 double 이 float 에 대입되는 것이기 때문에 큰 자료형에서 작은 자료형으로 대입이므로 오류가 난다.
        //float j =  3.14;// 방법1.강제형변환을 해야한다.
        float j = 3.14F; //방법2. 더 좋은 방법
        t.print( j ); //자료형이 딱 맞지 않아도 상관이 없다. 가장 쉽게 가깝게 자동형변환 되는 것으로
    }
}
