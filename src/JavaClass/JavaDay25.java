package JavaClass;
import java.util.*;
public class JavaDay25 {
    //------------------------- Array List Example--------------
    public static void main(String[] args) {
        // List<Integer> al=new ArrayList<>();
        // al.add(10);
        // al.add(20);
        // al.add(30);
        // al.add(40);
        // al.add(50);
        // al.add(60);
        // al.add(70);
        // al.add(80);
        // al.add(90);
        // al.add(100);
        // System.out.println(al);
        // al.remove(3);
        // System.out.println(al);
        // al.add(3, 35);
        // System.out.println(al);
        // al.set(3, 45);
        // System.out.println(al);
        // System.out.println(al.get(3));
        // System.out.println(al.size());
        // System.out.println(al.contains(45));
        // System.out.println(al.indexOf(45));
        // System.out.println(al.isEmpty());
        // al.clear();
        // System.out.println(al);
        // System.out.println(al.isEmpty());

        //-----------------------------Linked List--------------------

        // LinkedList list1=new LinkedList();
        // list1.add(10);
        // list1.add(0,30);
        // list1.add(20);
        // list1.addFirst(50);
        // System.out.println(list1);

        // //using iterator
        // list1.removeFirstOccurrence(30);
        // Iterator itr=list1.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        //--------------------Vector-------------------

        // Vector v=new Vector();
        // v.add(10);
        // v.add(20);
        // v.add(30);
        // System.out.println(v);

        //----------------- Stack --------------------

        Stack s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(40);
        s.pop();
        System.out.println(s);

    }
}
