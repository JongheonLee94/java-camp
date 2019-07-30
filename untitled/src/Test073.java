import java.util.ArrayList;
import java.util.List;
/*
    0개    "[]"
    1개    "['apple']"  *1개 일 때 ,가 없어야 하고 두개일때부터,로 구분
    2개    "['apple','banana']"
    3개    "['apple','banana','orange']"
 */
public class Test073 {
    public static void main(String[] args) {
        //hw2
        List<String> ls = new ArrayList<>();
        ls.add("apple");
        ls.add("banana");
        ls.add("orange");
        ls.add("kiwi");
        String l = HW.collectionString(ls);
        System.out.println(l);
    }
}
