class Temp7 {
    private Object data = null;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class Temp8{
    private String  data = null;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
//아래 코드에서 캐스팅이 필요한 경우와 필요하지 않은 경우를 구분한다.
// 모든 인스턴스를 저장 가능한 것은 ? Temp7 캐스팅 없이 꺼낼 수 있는 것은? Temp8
public class Test051 {
    public static void main(String[] args) {
        Temp8 t2 = new Temp8();
        t2.setData("HelloWorld");
        String l2 = t2.getData();

        Temp7 t = new Temp7();
        t.setData("HelloWorld");
        String l  = (String) t.getData();
    }
}
//1. t2는 같은형이기 때문에 필요없고  t는
