package JavaClass;
import java.util.Scanner;
// public class JavaDay19 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         // armstrong number without using predefined methods
//         int temp=n;
//         int t=n;
//         int sum=0;
//         int count=0;
//         while(n>0){
//             n=n/10;
//             count++;
//         }
//         n=temp;
//         while(n>0){
//             int rem=n%10;
//             int p=1;
//             for(int i=0;i<count;i++){
//                 p=p*rem;
//             }
//             sum=sum+p;
//             n=n/10;
//         }
//         if(t==sum){
//             System.out.println("Armstrong number");
//         }
//         else{
//             System.out.println("Not an armstrong number");
//         }
//     }
// }

//------------------------------Tree--------------------------------

public class JavaDay19 {
   class Node{
       int data;
       Node left;
       Node right;
       public Node(int d){
           this.data=d;
           this.left=null;
           this.right=null;
       }
   }
  public Node root=null;
  public void addRoot(int data){
    Node n=new Node(data);
    if(root==null){
        root=n;
    }
  }
   
  public void addLeft(int data){
    Node n=new Node(data);
   
        Node curr=root;
        while(curr.left!=null){
            curr=curr.left;
        }
        curr.left=n;
    
  }
  public void addRight(int data){
    Node n=new Node(data);
  
        Node curr=root;
        while(curr.right!=null){
            curr=curr.right;
        }
        curr.right=n;
    
  }

  public void inOrder(Node root){
    if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }
  public static void main(String[] args) {
    JavaDay19 j=new JavaDay19();
    j.addRoot(10);
    j.addLeft(20);
    j.addRight(30);
    j.addLeft(40);
    j.addRight(90);
    j.inOrder(j.root);

  }

}
