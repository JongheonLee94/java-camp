package study.alone.pattern;
class Singleton{
    private static Singleton instance;
    private Singleton() {
    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance =new Singleton();
        }
        return instance;
    }
    public void print(){
        System.out.println(this.getClass().getName());
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton t1 = Singleton.getInstance();
        Singleton t2 = Singleton.getInstance();
        Singleton t3 = Singleton.getInstance();
        t1.print();
        t2.print();
        t3.print();
        System.out.println(t1==t2);
        System.out.println(t2==t3);
    }
}

/*
싱글톤 패턴

애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 인스턴스를 만들어 사용하는 디자인패턴.



출처: https://jeong-pro.tistory.com/86 [기본기를 쌓는 정아마추어 코딩블로그]
 */