package JavaClass;
import java.util.*;
public class Main{
    class Node{
		int data;
		Node next;
		public Node(int d) {
			this.data=d;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public  void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
    public int compare(Node head1,Node head2){
        Node curr=head1;
        Node cur=head2;
        while(curr!=null && cur!=null){
            if(curr.data!=cur.data){
                return 0;
            }
            curr=curr.next;
            cur=cur.next;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=2;
        while(n-->0){
            Main m1=new Main();
            while(true){
                int k=sc.nextInt();
                if(k==-1)
                break;
                m1.addNode(k);
            }
            Main m2=new Main();
             while(true){
                int k=sc.nextInt();
                if(k==-1)
                break;
                m2.addNode(k);
            }
            int num=m1.compare(m1.head,m2.head);
            if(n>=1)
            System.out.println(num==0?"Result of first comparison: 0":"Result of first comparison: 1");
            else
            System.out.println(num==0?"Result of second comparison: 0":"Result of second comparison: 1");
        }   
    }
}

//this gives wrong ans
//input
// 1 2 3 4 5 -1
// 1 2 3 4 5 -1
// 1 2 3 4 5 -1
// 1 2 3 4 5 -1
//output
// Result of first comparison: 0
// Result of second comparison: 0

//write a print funtion to print singly linked list 1 2 3 4 like this

// 1
// 12
// 123
// 1234
// 2
// 23
// 234
// 3
// 34
// 4
public void print(){
    Node curr=head;
    while(curr!=null){
        Node cur=curr;
        while(cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
        System.out.println();
        curr=curr.next;
    }
}
