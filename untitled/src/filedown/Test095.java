package filedown;

class Toilet {

    public void bigWork(String str) {
        System.out.println("step 1:" + str + " do big work");
        System.out.println("step 2:" + str + " do big work");
        System.out.println("step 3:" + str + " do big work");
        System.out.println("step 4:" + str + " do big work");
        System.out.println("step 5:" + str + " do big work");
    }
}

class A2 implements Runnable {

    public A2(Toilet toilet) {
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

class B2 implements Runnable {

    private Toilet toilet = null;

    public B2(Toilet toilet) {
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

public class Test095 {

    public static void main(String[] args) {
        Toilet t = new Toilet();

        new Thread(new A2(t)).start();
        new Thread(new B2(t)).start();

    }
}
/*
    STEP 1.APPLE
    STEP 2.APPLE
    STEP 1.BANANA
    STEP 3.APPLE
    STEP 2.BANANA
    STEP 4.APPLE
    STEP 3.BANANA
    STEP 5.APPLE
    STEP 4.BANANA
    STEP 5.BANANA
    ... 하나밖에 없는 화장실에서 대 참사가 일어나는 중 ...
    쓰레드는 독자적으로 돌아가는 프로그램이기에 이런 일은 얼마든지 가능하다.

    화장실 문에 잠금을 해 줘야 한다.

    쓰레드가 프로그램에서는 잠금이 중요한데 그것을 동기화(Sychronization) 이라고 한다.

 */