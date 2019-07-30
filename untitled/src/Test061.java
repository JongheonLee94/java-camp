class Temp11 {

    public static int indexOf(char[] targetWord, char[] objectWord) {
        int i = -1;
        int range = targetWord.length;
        int pointer = 0;
        int key = objectWord.length - 1;

        for (int j = 0; j < range; j++) {
            if (targetWord[j] ==objectWord[pointer]) {
                if(pointer==objectWord.length-1){
                    System.out.println("찾았다.");
                    i=j-pointer;
                    break;
                }
                pointer+=1;
            }else{
                j=j-pointer;
                pointer=0;

            }
        }
        return i;
    }
}

public class Test061 {
    public static void main(String[] args) {

        //String 의 indexOf 와 동일한 동작을 하도록 만들어 주세요.
        int idx = Temp11.indexOf("HelloWorld".toCharArray(), "ld".toCharArray());
        System.out.println(idx); // 6
    }
}
