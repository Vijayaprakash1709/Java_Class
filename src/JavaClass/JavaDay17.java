package JavaClass;
import java.util.*;

//---------------Singly Linked List-----------------

// public class JavaDay17{
//     class Node{
// 		int data;
// 		Node next;
// 		public Node(int d) {
// 			this.data=d;
// 			this.next=null;
// 		}
// 	}
// 	public Node head=null;
// 	public Node tail=null;
// 	public  void addNode(int data) {
// 		Node newNode=new Node(data);
// 		if(head==null) {
// 			head=newNode;
// 			tail=newNode;
// 		}
// 		else {
			
// //			newNode.next=head;
// //			head=newNode;
			
// 			tail.next=newNode;
// 			tail=newNode;
// 		}
// 	}
	
// 	public void display() {
// 		Node curr=head;
// 		if(head==null) {
// 			System.out.println("The list is Empty");
// 		}
// 		else {
// 			while(curr!=null) {
// 				System.out.print(curr.data);
// 				if(curr!=tail) {
// 					System.out.print(" -> ");
// 				}
				
// 				curr=curr.next;
// 			}
// 			System.out.println();
// 		}
// 	}
	
// 	public void insertFirst(int data) {
// 		Node newNode=new Node(data);
// 		if(head==null) {
// 			head=newNode;
// 			tail=newNode;
// 		}
// 		else {
// 			newNode.next=head;
// 			head=newNode;
// 		}
// 	}

//swap adjacent elements in singly linked list
//     public void swapAdjacent(){
//         Node curr=head;
//         while(curr!=null && curr.next!=null){
//             int temp=curr.data;
//             curr.data=curr.next.data;
//             curr.next.data=temp;
//             curr=curr.next.next;
//         }
//     }
	
// 	public void insertNth(int data,int pos) {
// 		Node newNode=new Node(data);
// 		Node curr=head;
// 		if(head==null) {
// 			head=newNode;
// 			tail=newNode;
// 		}
// 		else {
// 			if(pos==1) {
// 				insertFirst(data);
// 			}
// 			else {
// 			int count=1;
// 			while(count<pos-1) {
// 				if(curr.next==null) {
// 					System.out.println("Invalid Position Entered");
// 					break;
// 				}
// 				curr=curr.next;
// 				count++;
				
// 			}
// 			newNode.next=curr.next;
// 			curr.next=newNode;
// 			}
// 		}
// 	}
	
// 	public void insertLast(int data) {
// 		Node newNode=new Node(data);
// 		if(head==null) {
// 			head=newNode;
// 			tail=newNode;
// 		}
// 		else {
// 			tail.next=newNode;
// 			tail=newNode;
// 		}
// 	}
//     public void deleteFirst() {
//         if(head==null) {
//             System.out.println("The list is Empty");
//         }
//         else {
//             head=head.next;
//         }
//     }
//     public void deleteLast() {
//         Node curr=head;
//         if(head==null) {
//             System.out.println("The list is Empty");
//         }
//         else {
            
//             while(curr.next!=tail) {
//                 curr=curr.next;
//             }
//             curr.next=null;
//             tail=curr;
//         }
//     }
//     public void deleteMiddle(int dat){
//         Node curr=head;
//         Node cur=head.next;
//         while (cur.data!=dat) {
//             cur=cur.next;
//             curr=curr.next;
//         }
//         curr.next=cur.next;

//     }
	
// 	public static void main(String[] args) {
// 		JavaDay17 j=new JavaDay17();
// 		j.addNode(10);
// 		j.addNode(20);
// 		j.addNode(30);
// 		j.display();
// 		j.insertFirst(200);
// 		j.display();
// 		j.insertNth(60, 2);
// 		j.display();
// 		j.insertLast(43);
// 		j.display();
//         j.deleteFirst();
//         j.display();
//         j.deleteLast();
//         j.display();
//         j.deleteMiddle(20);
//         j.display();
// }}


//----------------------Doubly Linked List-----------------

public class JavaDay17{
    class Node{
		String data;
		Node next;
        Node prev;
		public Node(String d) {
			this.data=d;
			this.next=null;
            this.prev=null;
		}
	}
    public Node head=null;
    public Node tail=null;
    public void addNode(String data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    public void display(){
        Node curr=head;
        if(head==null){
            System.out.println("List is Empty");
        }
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null){
                System.out.print(" <=> ");
            }
            curr=curr.next;
        }
        System.out.println();
    }

    public  void addFirst(String data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            
            head.prev=n;
            n.next=head;
            head=n;
        }
    }

    public void deleteMid(int n){
        n=n-1;
        Node curr=head;
        Node cur=head.next;

        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            while(n-1>0){
                curr=curr.next;
                cur=cur.next;
                n--;
            }
            cur=cur.next;
            cur.prev=curr.next;
            curr.next=cur;

        }
    }

    public void search(String n){
        Node cu=head;
        while(cu!=null && cu.data!=n){
            cu=cu.next;
        }
        if(cu==null){
            System.out.println("No Data Found");
        }
        else{
            System.out.println("The element found is : "+cu.data);
        }
    }

    public void changeElement(String n,String a){
        Node cu=head;
        while(cu!=null && cu.data!=n){
            cu=cu.next;
        }
        if(cu==null){
            System.out.println("Not found");
            return;
        }
        cu.data=a;
    }

    public void insertNthPos(String data,int pos){
        Node n=new Node(data);
        Node curr=head;
        Node cur=head.next;
        while(pos-1>1){
            curr=curr.next;
            cur=cur.next;
            pos--;
        }
        n.next=curr.next;
        n.prev=cur.prev;
        curr.next=n;
        cur.prev=n;

    }

		public static void main(String[] args) {
		JavaDay17 j=new JavaDay17();
        j.addNode("Hai");
        j.addNode("Welcome");
        j.addNode("I");
        j.addNode("am");
        j.addNode("Vijay");
        // j.display();
        j.addFirst("Hello");
        j.display();
        j.deleteMid(2);
        j.display();

        j.search("Hello");
        j.changeElement("Hello", "Java");
        j.display();
		j.insertNthPos("Class", 3);
        j.display();
}}
