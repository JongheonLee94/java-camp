/*
    Math.random(): 0 에서 1 사이의 소수값을 랜덤하게 출력한다. util 아래도 있다고 함 랜덤
    곱해서 캐스팅 하는 형태로 해서 정수를 발생시킬 수 있다.
 */

public class Test071 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            double d = Math.random();
            System.out.println((int)(d*100));
        }
    }
}
