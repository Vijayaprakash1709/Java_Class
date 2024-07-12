package JavaClass;
import java.util.*;
public class JavaDay26 {
    public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // LinkedList<Integer> list1=new LinkedList();
    // int sum=0;
    // for(int i=0;i<n;i++){
    //     int k=sc.nextInt();
    //     sum=sum+k;
    //     list1.add(k);
    // }
    // int n2=sc.nextInt();
    // LinkedList<Integer> list2=new LinkedList();
    // for(int i=0;i<n2;i++){
    //     int k=sc.nextInt();
    //     sum=sum+k;
    //     list2.add(k);
    // }
    // list1.addAll(list2);
    // System.out.println(list1);
    // System.out.println(sum);
    // System.out.println(sum/2);
    // for(int i=0;i<n+n2;i++){
    //     if(list1.get(i)==sum/2){
    //         list1.add(i,sum);
    //         list1.remove(i+1);
    //     }
    // }
    // int ans=0;
    // list1.contains(sum/2);
    // System.out.println(list1);



    // Queue<Integer> q1=new ArrayDeque<>();
    // q1.add(110);
    // q1.add(100);
    // q1.add(200);
    // q1.add(300);
    // q1.remove(200);
    // // q1.element();
    // System.out.println(q1.poll());
    // System.out.println(q1.peek());
    // System.out.println(q1.contains(200));
    // System.out.println(q1);
    

    // PriorityQueue<Integer> q=new PriorityQueue<>();
    // q.add(10);
    // q.add(20);
    // q.add(30);
    // System.out.println(q.isEmpty());
    // System.out.println(q.contains(20));
    // System.out.println(q.offer(20));
    // System.out.println(q.remove(20));

    //-------------Hash Set--------------

    Set<Integer> s=new HashSet<>();
    s.add(23);
    s.add(43);
    s.add(22);
    s.add(3);
    s.add(3);
    s.add(55);
    System.out.println(s);

    Set<Integer> s1=new LinkedHashSet<>();
    s1.add(23);
    s1.add(43);
    s1.add(22);
    s1.add(3);
    s1.add(3);
    s1.add(55);
    System.out.println(s1);

    Set<Integer> s2=new TreeSet<>();
    s2.add(23);
    s2.add(43);
    s2.add(22);
    s2.add(3);
    s2.add(3);
    s2.add(55);
    System.out.println(s2);

    
}

}
