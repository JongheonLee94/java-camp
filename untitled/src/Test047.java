public class Test047 {
    public static void main(String[] args) {
        int[] i = new int[]{4, 9, 6, 5};
        int max = i[0];
        for (int k = 0; k < i.length; k++) {
            if (max < i[k]) {
                max = i[k];
            }
        }
        System.out.println(max);


//        boolean a = Long.MAX_VALUE < Float.MAX_VALUE;
//        float b = Long.MAX_VALUE;
//        float e = (float) Long.MAX_VALUE;
//        float f = e - 1;
//        long d = (long) e;
//        long g = (long) f;
//        boolean c = Long.MAX_VALUE == d;
//        System.out.println(b + "==" + Long.MAX_VALUE + "?");
//        System.out.println(a + "" + c);
//        System.out.println(d);
//        System.out.println(g);
//        System.out.println(e);
    }
}

