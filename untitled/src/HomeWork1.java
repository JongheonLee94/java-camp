public class HomeWork1 {
    public static void main(String[] args) {
        double money= 100;//자동형변환
        for (int i = 1; i <= 100; i++) {
            money = money*1.066;
        }
        System.out.println("money = " + money +"만원");
    }
}
