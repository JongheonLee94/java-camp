package filedown;

/*
    Program : executable file.
    Process : a running program.       프로그램 더블클릭실행하면 프로세스
    Thread : a light-weighted process   (독자 행동을 하지만 조금 다르다.
    :쓰레드는 프로세스 안에서만 존재가 가능하다.
    :쓰레드간 메모리를 공유할 수 있다.
        프로세스간은 메모리 전달은 가능해도 공유는 불가능하다.
       '프로세스간의 메모리 전달의 대표적 수단이 소켓이다.'
       ( 복사 &붙이기도 전달로 볼 수 있지만 이건 윈도우에서 국한된 개념)
       :프로세스 종료 == 프로세스가 가진 모든 쓰레드의 종료
       (인간을 생각하면 이해 쉬움 : 뇌 위장 척추 ... )
  */
class A implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Apple!");
            try {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time); // 밀리세컨드 단위
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Banana!");
            try {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time); // 밀리세컨드 단위  throw가 있기 때문에 catch 나 throws 해줘야
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test94 {
    public static void main(String[] args) {
        new Thread(new A()).start();
        new Thread(new B()).start();
    }
}
/* 쓰레드는 독자적으로 돌아가는 프로그램이 된다.
    :apple 사이에 banana 끼어들게 안 짰는데 결과는 그러했다.
    어떻게 해석할까?
 */
