package filedown;

class CustomThreaded implements Runnable{

    //오버라이딩 할 때 throws Exception 같은 거 붙여서는 못한다.
    // (조상에 선언된 대로만 재 정의해야 한다.

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("HellowWorld " + i);
        }
    }
}

public class Test093 {
    public static void main(String[] args) {
        //자바가 서버를 만드는데 적합하다. 이유 1. 소켓이 잘 되어 있고 2. 쓰레드가 잘 되어있다. 이 둘다 bulit in 되어있다.
        Runnable rb = new CustomThreaded();
        rb.run(); //단순 함수 호출
/*
        // new Thread() 하면 가상의 CPU 를 OS에서 할당받는다. (분신)
//       할당 받은 cpu 는 생성자에 넘겨진 포인터를 물고간다.
//       start() 호춠에 준비과정을 거쳐 새로운 가상 CPU 가
//                rb.run() 을 호출한다.
        1. Runnable 상속받은 클래스 선언 .
        2. new Thread 하면서 1의 인스턴스의 포인터를 넘긴다.
        3.Thread :: start() 를 호출하면 가상 CPU (Thread) 가 run() 호출
        다른방법이 있긴하다.
        */
        Thread th = new Thread( rb );
        th.start();
    }
}
