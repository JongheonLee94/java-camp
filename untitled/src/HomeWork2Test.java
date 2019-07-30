public class HomeWork2Test {
        public static void main(String[] args) {
            double money;

            double sum =0;
            for (int i = 0; i < 100; i++) {
                System.out.println(i+1+"번째");

                money= 100;//자동형변환
                for (int j = 0; j <100-i ; j++) {
                    money = money*1.066;

                }
                sum+=money;
                System.out.println("money = " + money+"만원");
            }

        }
    }


