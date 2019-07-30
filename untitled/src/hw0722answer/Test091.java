//package soribada;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//class Node<U>{
//    U data = null;
//    Node<U> next=null;
//}
//class LinkedList<T> {
//    public void save(String fileName) throws IOException {
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
//
//        for (Node<T> n = head)
//    }
//}
//
//class Score {
//    private String id = null;
//    private int score = 0;
//}
//
//class DataUtil {
//    public static void populate( Object ob , ObjectInputStream out) {
//        if( ob instanceof Score){
//            Score sc = (Score)ob;
//
//            out.writeUTF( sc.getId() );
//            out.writeInt( sc.getScore() );
//        }
//    }
//}
//
//public class Test091 {
//    public static void main(String[] args) {
//
//    }
//}
