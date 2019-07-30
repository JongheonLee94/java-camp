public class HomeWork2 {
    public static void main(String[] args) {
        long startTime =System.currentTimeMillis();
        double money=0;//자동형변환
        for (int i = 1; i <= 100; i++) {

            money =money + 100;
            money = money*1.066;
        }
        System.out.println("money = " + money +"만원");
        long endTime =System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

}
