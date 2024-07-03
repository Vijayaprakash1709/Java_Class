package JavaClass;

//-------------------------------Singly Circular--------------------

// public class JavaDay18 {
//     class Node{
// 		int data;
// 		Node next;
// 		public Node(int d) {
// 			this.data=d;
// 			this.next=null;
// 		}
// 	}
//     public Node head=null;
//     public Node tail=null;

//     public void addNode(int data){
//         Node n=new Node(data);
//         if(head==null){
//             head=n;
//             tail=n;
//         }
//         else{
//             tail.next=n;
//             tail=n;
//             tail.next=head;
//         }
//     }

//     public void print(){
//         Node curr=head;
//         if(head==null){
//             System.out.println("List is empty");
//         }
//         else{
//             do{
//                 System.out.print(curr.data + " -> ");
//                 curr=curr.next;
//             }while(curr!=head);
//             System.out.println();
//         }
//     }

//     public void deleteLast(){
//         Node curr=head;
//         while(curr.next!=tail){
//             curr=curr.next;
//         }
//         tail=curr;
//         tail.next=head;
//     }
//    public static void main(String[] args) {
//     JavaDay18 j=new JavaDay18();
//     j.addNode(20);
//     j.addNode(30);
//     j.addNode(10);
//     j.print();
//     j.deleteLast();
//     j.print();
//    }
    
// }


//-------------------------Doubly Linked List------------------

public class JavaDay18 {
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

    public void addNode(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
            tail.next=head;
        }
    }

    public void print(){
        Node curr=head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            do{
                System.out.print(curr.data + " -> ");
                curr=curr.next;
            }while(curr!=head);
            System.out.println();
        }
    }

    public void deleteLast(){
        Node curr=head;
        while(curr.next!=tail){
            curr=curr.next;
        }
        tail=curr;
        tail.next=head;
    }
   public static void main(String[] args) {
    JavaDay18 j=new JavaDay18();
    j.addNode(20);
    j.addNode(30);
    j.addNode(10);
    j.print();
    j.deleteLast();
    j.print();
   }
    
}