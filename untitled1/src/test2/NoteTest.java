package test2;

class Node<T>{
    T data=null;
    Node next =null;

    public Node(T i){
        this.data = i;
    }
}
interface Ilist<U>{
    public void add();
    public U pop();
    public void print();
}
abstract class LinkedList implements Ilist{

    public LinkedList() {
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public void print() {

    }
}
class Queue{

}
class Stack{

}
public class NoteTest {

}
