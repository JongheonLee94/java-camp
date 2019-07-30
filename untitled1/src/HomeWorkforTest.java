class Node { //외워라!
    int data = 0; //  대입은 원래 불가능하나 선언과 동시에 대입은 가능함
    Node next = null; //가리키고 싶지않다.

    Node(int i, Node n) { //생성자 일반적 예시
        this.data = i;
        this.next = n;
    }
}


class Stack{
    Node bottom =null;
    Node top = null;

    void push(int i){
        top = new Node(i, top);
    }
    int pop(){
        int i=0;
        i = top.data;
        top = top.next;
        return i;
    }
    public void print() {
        for (Node n = top; n != null  ; n = n.next) {
            System.out.println(n.data);
        }
    }
}


class Queue {
    Node head = null;
    Node tail = null;

    public Queue() {
        this.head = new Node(0, null);
        this.tail = this.head;
    }

    void push(int i) {
        tail.next = new Node(i, null);
        tail = tail.next;
    }
    int pop(){
        int i= 0;
        i=head.next.data;
        head=head.next;
        return i;
    }
}

public class HomeWorkforTest {
    public static void main(String[] args) {

    }
}
