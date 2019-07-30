class Temp9<T extends Object>{
    private T data = null;
    public T getData(){ return  data;}
    public void setData(T i ){data = i;}
}
/*
    인스턴스의 자료형을 동적으로 결정할 수 있다. : 제너릭의 개념
    1.5 버젼부터 지원되었다.

    <> 안에 지정 간으한 타입은 참조형변수 타입이어야 한다.(자료형 안됨)
    : C++의 템플레이트 ... 가 이거랑 같다. C++ 은 자료형도 <> 안에 허용
 */
public class Test052 {
    public static void main( String[] args){
        Temp9<String> t = new Temp9<String>();
        t.setData("HelloWorld");
        String l = t.getData();
    }
}
