class Node { //외워라!
    int data = 0; //  대입은 원래 불가능하나 선언과 동시에 대입은 가능함
    Node next = null; //가리키고 싶지않다.

    Node(int i, Node n) { //생성자 일반적 예시
        this.data = i;
        this.next = n;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    public LinkedList() {
        this.head = new Node(0, null);
        this.tail = this.head;
    }

    void add(int i) {
        tail.next = new Node(i, null);
        tail = tail.next;
    }

    public void print() {
        for (Node n= head.next; n != null  ; n = n.next) {
            System.out.println(n.data);
        }
    }
}

public class Test029 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.print();
    }
}
/*
    모든 참조형 변수에는 null 이라는 값이 대입 가능 : 가리키는 인스턴스 없다.
    -어떻게 돌아가는지 상황파악을 그림으로 설명 가능할 것.
 */