class Node2 { //외워라!
    int data = 0; //  대입은 원래 불가능하나 선언과 동시에 대입은 가능함
    Node2 next = null; //가리키고 싶지않다.

    Node2(int i, Node2 n) { //생성자 일반적 예시
        this.data = i;
        this.next = n;
    }
}

class LinkedList2 {
    Node2 head = null;
    Node2 tail = null;

    public LinkedList2() {
        this.head = new Node2(0, null);
        this.tail = this.head;
    }

    void add(int i) {
        tail.next = new Node2(i, null);
        tail = tail.next;
    }
}

class Stack{
    Node2 bottom =null;
    Node2 top = null;

    void push(int i){
        top = new Node2(i, top);
    }
    int pop(){
        int i=0;
            i = top.data;
            top = top.next;
        return i;
    }
    public void print() {
        for (Node2 n= top; n != null  ; n = n.next) {
            System.out.println(n.data);
        }
    }
}

class Queue {
    Node2 head = null;
    Node2 tail = null;

    public Queue() {
        this.head = new Node2(0, null);
        this.tail = this.head;
    }

    void push(int i) {
        tail.next = new Node2(i, null);
        tail = tail.next;
    }
    int pop(){
        int i= 0;
        i=head.next.data;
        head.next=head.next.next;
        return i;
    }
}

public class StackByNode {
    public static void main(String[] args) {
        Stack l = new Stack();
        l.push(10);
        l.push(20);
        l.print();

        System.out.println(l.pop());

        System.out.println(l.pop());
        Queue queue= new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
        queue.push(6);
        System.out.println(queue.pop());
        queue.push(7);
        System.out.println(queue.pop());

    }
}
/*
    모든 참조형 변수에는 null 이라는 값이 대입 가능 : 가리키는 인스턴스 없다.
    -어떻게 돌아가는지 상황파악을 그림으로 설명 가능할 것.
 */