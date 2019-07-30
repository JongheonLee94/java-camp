package filedown;

/*
    모든 인스턴스에는 lock 이라는 개념의 자물쇠? 열쇠? 가 있다.
    synchronized (this){...}

    this가 가리키는 인스턴스가 가지고 있는 록을 획득해야 { 에 진입 가능.
    획득하지 못하면 쓰레드는 머추어 기다려야 한다.
 */
class Toilet3 {

    public void bigWork(String str) {
        synchronized (this) {
            System.out.println("step 1:" + str + " do big work");
            System.out.println("step 2:" + str + " do big work");
            System.out.println("step 3:" + str + " do big work");
            System.out.println("step 4:" + str + " do big work");
            System.out.println("step 5:" + str + " do big work");

        }
    }
    //중간에 방해받으면 안된다. 메서드에도 넣을 수 있음
    //필요한 부분에만 걸어야한다 아니면 퍼포먼스 낮아짐
    public synchronized void sleepWork(String by) {
        System.out.println("SLEEP STEP 1. " + by);
        System.out.println("SLEEP STEP 2. " + by);
        System.out.println("SLEEP STEP 3. " + by);
    }
}

class A4 implements Runnable {

    public A4(Toilet3 toilet) {
        this.toilet = toilet;
    }

    private Toilet3 toilet = null;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            int time = (int) (Math.random() * 1000);
            if(time % 2 == 0){
                toilet.bigWork("Apple");

            }else {
                toilet.sleepWork("Apple");
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B4 implements Runnable {

    private Toilet3 toilet = null;

    public B4(Toilet3 toilet) {
        this.toilet = toilet;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int time = (int) (Math.random() * 1000);
            if(time % 2 == 0){
                toilet.bigWork("Apple");

            }else {
                toilet.sleepWork("Apple");
            }
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test097 {

    public static void main(String[] args) {
        Toilet3 t = new Toilet3();

        new Thread(new A4(t)).start();
        new Thread(new B4(t)).start();

    }
}
/*


 */