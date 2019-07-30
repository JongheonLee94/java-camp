package filedown;

class A5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A ruuning");
        }
    }
}

class B5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B ruuning");
        }
    }
}


class C5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("C ruuning");
        }
    }
}

public class Test098 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        threads[0] = new Thread(new A5());
        threads[1] = new Thread(new B5());
        threads[2] = new Thread(new C5());
        threads[0].start();
        threads[1].start();
        threads[2].start();

        try {
            threads[0].join();
            threads[1].join();
            threads[2].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종정리");
    }
}


