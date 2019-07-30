import java.util.*;
/*
	map은 순서 개념 없이 key=value 형태의 마치 사전과 같은 형태로 저장합니다.
	put 함수로 저장,  get 함수로 key 에 해당하는 value를 뽑아낸다.

	List , set , Map 형태로 뭔가를 저장하는 형태를 흔히 Collection 이라고 한다.
	List 순서 있음 중복 허용 , set 순서없음 중복허용하지 않음 , Map 순서없음  중복허용하지 않음 쌍으로 저장
	*/
public class Test070{
    public static void main(String[] args) throws Exception{
        Map<String,String> map = new Hashtable<String,String>();
        map.put("apple","사과");
        map.put("banana","바나나");
        map.put("orange","오렌지");
        map.put("kiwi","키위");
        map.put("apple","사과2"); //전에 있던 값을 덮어씌움

        System.out.println(map);
        String value = map.get("kiwi");
        System.out.println(value);

        // Iterator 는 표준 검색방법이다. KeySet() 은 key 값만의 Set 을 생성한다.
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String l = it.next();
            String v = map.get(l);
            System.out.println(l + " " + v);
        }

        System.out.println(map.toString());
    }
}