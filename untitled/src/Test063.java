public class Test063 {
    public static void main(String[] args) {
        boolean i = true;
        boolean j = false;

        System.out.println(10<3);
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(10.0/3); //3.3333333333333335 보면 5가 생기는데 3.3333.... 의 결과와 가장 유사한 값으로 만든것이다.  그렇기 때문에 이 작은 값으로 오차가 날 수 있다는것을 기억하자

        System.out.println(3.3333333333333333 *3 ==10.0); //true 가 된다.
        int k= 0;
        boolean k2=true;
        while (k2){
            k2=3.3333333333333330 *3 ==10.0;
        }

        System.out.println(3.3333333333333330 *3 ==10.0); //true 가 된다. 이렇게  예상하지 못한 결과가 나올 수 있다.
        // 비교연산은 boolean 값을 리턴 : ==, != , > , < , >= , <=
        // 거의 모든 연산은 같은 자료형 끼리 가능 : int / int = int, int + int = int, int % int = int 그리고 대부분 결과도 같음
    }
}
// C 는 정수값 0 은 false , 0 이 아닌 모든 정수는 true
// if( 100 )
