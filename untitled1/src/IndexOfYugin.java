
class Temp{
    protected int w=0;
    //H e l l o W o r l d  /  l o
    static int indexOf(char[] i, char[] j){
        for(int q=0; q<i.length-j.length+1; q++){
            for(int w=0; w<j.length; w++){
                //i[q] j[w]비교 안돼? break /돼? 계속진행
                if(i[q+w]==j[w]){

                    if(w==j.length-1) return q;
                }else{
                    break;
                }
				/*
				if(i[q]==j[w] && i[q+1]==j[w+1]){	
					return q;
				}*/
            }
        }
        return -1;
    }

    //Object i -> char []i = "HelloWorld".toCharArray()	i[0]=H
    //Object j -> char []j = "or".toCharArray()		j[0]=o, j[1]=r

}

public class IndexOfYugin{
    public static void main(String[] args){
        int idx = Temp.indexOf("HelloWorld".toCharArray(),"or".toCharArray()); //6
        System.out.println(idx);

        System.out.println(Temp.indexOf("HelloWorld".toCharArray(),("rl" +
                "").toCharArray())); //-1
        System.out.println(Temp.indexOf("HelloWorld".toCharArray(),"d1".toCharArray())); //4

    }
}