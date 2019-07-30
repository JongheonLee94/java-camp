public class Test045 {
    public static void main(String[] args) {
        int[] i = new int[]{1,2,3,4}; //자바에서는 new 를 했기 때문에  배열은 인스턴스이고 i는 참조형 변수이다.
        int[] k ={1,2,3,4};   //이것도 가능 초창기는 안됐음.
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i.length);

        // 이 코드는 외운다.
        for (int j = 0; j < i.length; j++) {
            System.out.println( i[j] );
        } //itar


    }
}
/*배열 : 동일한 형태의 기억장소가 연속으로 할당된 기억공간.
       자바의 배열은 인스턴스다. i는 참조형변수다.
       i.length 는 배열의 멤버변수이고 길이를 의미한다.

  int[] j ={1,2,3,4};   //이것도 가능  헌데 이건 new int[] 가 생략된 형태.
 */
