import java.util.*;
/*
	ArrayList 속도가 빠르다. 내부적으로 배열을 이용한다.
	-배열을 써서 단순히 쌓는 속도는 빠른데, 중간 삭제시에는 비효율적이다.
	꽉차면 2배로 늘림 소라게가 고동을 옮기 듯이 단 이때 오버헤드 발생

	LinkedList는 Node 를 이용하기에 단순하게 쌓는 속도는 느리다.
		중간에 추가 삭제가 빈번한 경우에는 용이하다.

	둘다 사용가능한 이유는 둘다 List를 상속한다.
	List를 상속받은 클래스는 특징이 존재한다.
	-중복되는 걸 허용한다. 검색시에 들어간 순서대로 나온다. (수너대로 보관한다.)
*/
public class Aad{
    public static void main(String[] args) throws Exception{
        List<String> l = new LinkedList<String>();
        l.add("apple");
        l.add("banana");
        l.add("orange");
        l.add("kiwi");
        l.add("apple");

        // 향상ㄷ괸 for 문장
        for(String t : l){
            System.out.println(t);
        }
    }
}