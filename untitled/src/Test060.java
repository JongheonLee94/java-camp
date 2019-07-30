public class Test060 {
    public static void main(String[] args) {
        String l = "HelloWorld";
        System.out.println(l.substring(2,5));  // llo
        //| H | e | l | l | o | W | o | r | l | d |
        //0   1   2   3   4   5   6   7   8   9   10

        // 문자열 안의 부분 문자열의 위치를 리턴 : 6
        System.out.println(l.indexOf("or"));

        // 없는 문자열을 찾을 때는 -1을 리턴한다.
        System.out.println(l.indexOf("xx"));

        //시작되는 단어를 비교한다 맞으면 true
        System.out.println(l.startsWith("Hell"));

        // 끝나는 단어를 비교한다.
        System.out.println(l.startsWith("ld"));

        // 자료형의 배열을 리턴해 준다.
        char[] ch = l.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);

        }

    }
}
