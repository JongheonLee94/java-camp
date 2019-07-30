package filedown;
/*
    모든 인스턴스에는 lock 이라는 개념의 자물쇠? 열쇠? 가 있다.
    synchronized (this){...}

    this가 가리키는 인스턴스가 가지고 있는 록을 획득해야 { 에 진입 가능.
    획득하지 못하면 쓰레드는 머추어 기다려야 한다.
 */
class Toilet2 {

    public void bigWork(String str) {
        synchronized ( this){
        System.out.println("step 1:" + str + " do big work");
        System.out.println("step 2:" + str + " do big work");
        System.out.println("step 3:" + str + " do big work");
        System.out.println("step 4:" + str + " do big work");
        System.out.println("step 5:" + str + " do big work");

        }
    }
}

class A3 implements Runnable {

    public A3(Toilet toilet) {
        this.toilet = toilet;
    }

    private Toilet toilet = null;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            toilet.bigWork("Apple");
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B3 implements Runnable {

    private Toilet toilet = null;

    public B3(Toilet toilet) {
        this.toilet = toilet;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            toilet.bigWork("banana");
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test096 {

    public static void main(String[] args) {
        Toilet t = new Toilet();

        new Thread(new A2(t)).start();
        new Thread(new B2(t)).start();

    }
}
/*


 */