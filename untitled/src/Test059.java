public class Test059 {
    public static void main(String[] args) {
        long start1 =System.currentTimeMillis();
        String l = "";
        for (int i = 0; i < 100000; i++) {
            l=l+"apple";
        }
        System.out.println(l);
        long end1 =System.currentTimeMillis();

        long start2 =System.currentTimeMillis();
        StringBuffer l2 = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            l2.append("apple");
        }
        System.out.println(l2);
        long end2 =System.currentTimeMillis();
        System.out.println(end1-start1);
        System.out.println(end2-start2);
    }
}
/*
    java -verbosegc Test059
    메모리가 부족할 때 메모리를 비우고 확보하는 일을 모니터링 하게 된다.  -퍼포먼스 확인할때 메모리가 어디서 많이 샌다 하면 쓰면 좋음
 */
