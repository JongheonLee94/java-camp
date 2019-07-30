class Node3 <T extends Object>{
    T data = null;
    Node3 next = null;

    Node3(T i , Node3<T> n){
        data = i;
        next = n ;
    }
}
/*
    오늘의 과제 : LinkedKist 클래스를 만들되 제너릭을 써서 만들 것.
    class LinkedList <X extends Object>{
    add
    print
    }
 */
class LinkedList3<X extends Object>{
    Node3<X> head = null;
    Node3<X> tail = null;
    public LinkedList3() {
        head = new Node3<X>(null, null);
        tail = head;
    }

    public LinkedList3 add(X i){
        tail.next = new Node3<X>(i,null);
        tail = tail.next;
        return this;
    }
    public void print(){
        for (Node3<X> n = head.next; n != null ; n=n.next) {
            System.out.println(n.data);

        }
    }
}

public class Test053 {
    public static void main(String[] args) {

        LinkedList3<String> l =new LinkedList3();
        LinkedList3<Integer> l2 =new LinkedList3();
        l.add("가나").add("가나").add("가나").add("가나");
        l2.add(1).add(1).add(1).add(1).add(1);

        l.print();
        l2.print();

    }
}
