package JavaClass;
import java.util.*;
public class JavaDay26 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    LinkedList<Integer> list1=new LinkedList();
    int sum=0;
    for(int i=0;i<n;i++){
        int k=sc.nextInt();
        sum=sum+k;
        list1.add(k);
    }
    int n2=sc.nextInt();
    LinkedList<Integer> list2=new LinkedList();
    for(int i=0;i<n2;i++){
        int k=sc.nextInt();
        sum=sum+k;
        list2.add(k);
    }
    list1.addAll(list2);
    System.out.println(list1);
    System.out.println(sum);
    System.out.println(sum/2);
    for(int i=0;i<n+n2;i++){
        if(list1.get(i)==sum/2){
            list1.add(i,sum);
            list1.remove(i+1);
        }
    }
    int ans=0;
    list1.contains(sum/2);
    System.out.println(list1);
}

}
