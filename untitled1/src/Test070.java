import java.util.*;
/*
	map은 순서 개념 없이 key=value 형태의 마치 사전과 같은 형태로 저장합니다.
	put 함수로 저장,  get 함수로 key 에 해당하는 value를 뽑아낸다.
	*/
public class Test070{
    public static void main(String[] args) throws Exception{
        Map<String,String> map = new Hashtable<String,String>();
        map.put("apple","사과");
        map.put("banana","바나나");
        map.put("orange","오렌지");
        map.put("kiwi","키위");

        System.out.println(map);

        String value = map.get("kiwi");
        System.out.println(value);


    }
}