import java.util.*;


/*
    2가지 이상의 다른 방법으로 구현해 보세요.
    1가지 방법에는 Collection 금지.
    100은 0-99까지수 6은 6개
 */
class HW {
    public static int[] randomArray(int i1, int i) {
        Set<Integer> s = new TreeSet<>();
        int ranNum;
        while (s.size() <= i1) {
            ranNum = (int) (Math.random() * i);
            s.add(ranNum);
        }
        int[] arr = new int[i1];
        Iterator<Integer> it = s.iterator();
        for (int j = 0; j < i1; j++) {
            if (it.hasNext())
                arr[j] = it.next();
        }
        return arr;
    }


    public static int[] randomArray3(int i1, int i) {
        int[] arr = new int[i1];
        int cnt = 0;
        int rannum;
        boolean bool;
        while (cnt < i1) {
            rannum = (int) (Math.random() * i);
            bool = true;
            for (int j = 0; j < cnt; j++) {
                bool = bool && arr[j] != rannum;
            }
            if (bool) {
                arr[cnt] = rannum;
                cnt++;
            }
        }
        return arr;
    }


    public static void print(int[] rl) {
        for (int i = 0; i < rl.length; i++) {
            System.out.print(rl[i] + " ");
        }
    }

    public static String collectionString(List<String> ls) {
        Iterator<String> it = ls.iterator();
        StringBuffer sb = new StringBuffer("[");
        while (it.hasNext()) {
            sb.append("'");
            sb.append(it.next());
            sb.append("'");
            if(it.hasNext()){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


public class Test072_HW {
    public static void main(String[] args) {
        //hw1
//        int[] rl = HW.randomArray(6,100);
//        HW.print(rl);
        int[] rl2 = HW.randomArray3(6, 6);
        HW.print(rl2);

    }
}
