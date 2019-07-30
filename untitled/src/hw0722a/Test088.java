package hw0722a;

import java.io.*;

/*
    콘솔에서 한 줄씩 읽어들여서 사용할 때 아래의 방법을 쓴다.
 */
class Score {
    //학번, 이름, 학점 저장
    private String stn;
    private String name;
    private String score;

    public String getStn() {
        return stn;
    }

    public void setStn(String stn) {
        this.stn = stn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}

class Node<T> {
    T data = null;
    Node<T> next;

    public Node(T student, Node<T> next) {
        this.data = student;
        this.next = next;
    }
}

class LinkedList<Y> {
    Node<Y> head = null;
    Node<Y> tail = null;
    private int has_node = 0;

    public int getHas_node() {
        return has_node;
    }

    public LinkedList() {
        this.head = new Node<Y>(null, null);
        this.tail = this.head;
    }

    void add(Y i) {
        tail.next = new Node<Y>(i, null);
        tail = tail.next;
        has_node++;
    }

    public Node<Y>[] popAll() {
        int cnt = 0;
        Node<Y>[] arr = new Node[has_node];
        for (Node<Y> n = head.next; n != null; n = n.next) {
            arr[cnt] = n;
            cnt++;
        }
        return arr;
    }

    public void print() {

    }

    public void save() {


    }
}

class DataUtil {
    public static Score setGeneric(Object obForScore, ObjectOutputStream out) {
        Score score = null;
        if (obForScore instanceof Score) {
            score = (Score) obForScore;
        }
        return score;
    }
}

public class Test088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String l = null;

//        while (!"quit".equals(l)){
//            System.out.println("[ M E N U ]");
//            System.out.println("1. 새 자료");
//            System.out.println("2. 자료 입력");
//            System.out.println("3. 파일로 저장");
//            System.out.println("4. 파일에서 불러오기");
//
//            l = br.readLine();
//
//            System.out.println(">" + l);
//        }
        LinkedList<Score> list = null;
        while (true) {
            System.out.println("[ M E N U ]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력");
            System.out.println("3. 파일로 저장");
            System.out.println("4. 파일에서 불러오기");
            l = br.readLine();
            if (l == "quit") {
                break;
            } else if (l.equals("1")) {
                list = new LinkedList<Score>();
                System.out.println("새 자료가 생성되었습니다.");
            } else if (l.equals("2")) {
                Score scoreTemp;
                String[] arr = null;
                boolean b = false;
                while (!b) {
                    System.out.println("형식: 학번,이름,학점");
                    l = br.readLine();

                    arr = l.split(",");
                    System.out.println(arr.length);
                    b = arr.length == 3;

                    if (b) {
                        scoreTemp = new Score();
                        scoreTemp.setStn(arr[0]);
                        System.out.println("학번: " + arr[0]);
                        scoreTemp.setName(arr[1]);
                        System.out.println("이름: " + arr[1]);
                        scoreTemp.setScore(arr[2]);
                        System.out.println("학점: " + arr[2]);

                        if (list==null){
                            list=new LinkedList<Score>();
                        }
                        list.add(scoreTemp);
                        break;
                    } else {
                        System.out.println("형식에 맞지않습니다.");
                    }
                }
            } else if (l.equals("3")) {
                    //저장
                list.save();
            } else if (l.equals("4")) {
                   //불러오기
            } else if (l.equals("5")) {
                   //출력
            }


        }
        br.close();
    }
}


/*
package hw0722a;
        import java.io.*;


//    콘솔에서 한 줄씩 읽어들여서 사용할 때 아래의 방법을 쓴다.

class  Score{
    //학번 학점저장
    String stn;
    String score;
}
class Node<T>{
    T data = null;
    T score =null;
    Node<T> next;

    public Node(T stn, Node<T> next) {
        this.data = stn;
        this.next = next;
    }
}
class LinkedList<Y> {
    Node<Y> head = null;
    Node<Y> tail = null;
    int has_node =0;
    public LinkedList() {
        this.head = new Node<Y>(null, null);
        this.tail = this.head;
    }

    void add(Y i ) {
        tail.next = new Node<Y>(i, null);
        tail = tail.next;
        has_node++;
    }
    public Node<Y>[] popAll() {
        int cnt=0;
        Node<Y>[] arr=new Node[has_node];
        for (Node<Y> n= head.next; n != null  ; n = n.next) {
            arr[cnt]=n;
            cnt++;
        }
        return arr;
    }
    public void save (){

    }
}

public class Test088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String l = null;

//        while (!"quit".equals(l)){
//            System.out.println("[ M E N U ]");
//            System.out.println("1. 새 자료");
//            System.out.println("2. 자료 입력");
//            System.out.println("3. 파일로 저장");
//            System.out.println("4. 파일에서 불러오기");
//
//            l = br.readLine();
//
//            System.out.println(">" + l);
//        }
        LinkedList<Score> list = null;
        String l2 = null;
        while (true){
            System.out.println("[ M E N U ]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력");
            System.out.println("3. 파일로 저장");
            System.out.println("4. 파일에서 불러오기");
            l = br.readLine();
            if(l.equals("1")){
                list =new LinkedList<Score>();
            }else if(l.equals("2")){
                //      String l = "10101,100"
                int idx=-1;
                do {
                    System.out.println("형식: 학번(6자리),(쉼표)학점(3자리) ");
                    l2= br.readLine();
                    idx=l2.indexOf(",");
                }while (idx==-1);
                String stn=l2.substring(0,idx);
                String score=l2.substring(idx+1);
                System.out.println(stn);
                System.out.println(score);
                System.out.println(l2);
                Score score1 =new Score();
                score1.stn=stn;
                score1.score=score;
                System.out.println(score1.toString());
                list.add(score1);
            }else if(l.equals("3")){
                //      String l = "score..dat" 저장
                Writer out =  new OutputStreamWriter(new  FileOutputStream ("score.txt"));
                for (Node<Score> n :list.popAll()){
                    out.write(n.data.stn+n.data.score +"\n");
                    out.flush();
                }
                out.close();

            }else if(l.equals("4")){
                //      String l = "score..dat" 불러오기
                Reader in =new InputStreamReader( new FileInputStream("score.txt"));
                int r ;
                boolean b=true;
                while (b){

                    int[] a =new int[9];
                    String raw="";
                    for (int i = 0; i < 9; i++) {
                        a[i]=in.read();
                        raw+= String.valueOf((char)a[i]);
                        b= a[i]==-1;
                        System.out.println(raw);
                    }

                    Score score2 =new Score();
                    score2.stn=raw.substring(0,6);
                    score2.score=raw.substring(6,9);
                    list.add(score2);

                }
//

                in.close();
            }else if(l.equals("quit")){
                break;
            }

        }
        br.close();
    }
}
*/