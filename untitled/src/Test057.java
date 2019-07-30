class Temp10 {
    int data = 0;

    // 아래코드의 t 와 this가 가리키는 대상은 같다.
    //      따라서  t.add(10) 은 10을 더한 후에 t로 바꿔 쓸 수 있어진다.
    //      StringBuffer 의 append 에서 볼 수 있다.

    Temp10 add(int i) {
        data = data + i;
        return this;
    }
}

public class Test057 {
    public static void main(String[] args) {
        Temp10 t = new Temp10();
        t.add(10).add(10).add(10).add(10).add(10).add(10).add(10);
        System.out.println(t.data);



    }
}
