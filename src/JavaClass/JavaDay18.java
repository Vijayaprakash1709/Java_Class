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


//-------------------------Doubly Circular Linked List------------------

public class JavaDay18 {
    // Node class
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
 
    }
       //insert first last and print
         public Node head=null;
            public Node tail=null;
            public void addNode(int data){
                Node n=new Node(data);
                if(head==null){
                    head=n;
                    tail=n;
                    head.prev=null;
                    tail.next=null;
                }
                else{
                    tail.next=n;
                    n.prev=tail;
                    tail=n;
                    tail.next=head;
                    head.prev=tail;
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
                head.prev=tail;
            }
            public void addFirst(int data){
                Node n=new Node(data);
                if(head==null){
                    head=n;
                    tail=n;
                    head.prev=null;
                    tail.next=null;
                }
                else{
                n.next=head;
                head.prev=n;
                head=n;
                head.prev=tail;
                tail.next=head;
            }}
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

//----------------------Stack Using Linked List-------------------


// public class JavaDay18 {
//     class Node{
// 		int data;
// 		Node next;
// 		public Node(int d) {
// 			this.data=d;
// 			this.next=null;
// 		}
// 	}
//     public Node top=null;
//     public void push(int data){
//         Node n=new Node(data);
//         if(top==null){
//             top=n;
//         }
//         else{
//             n.next=top;
//             top=n;
//         }
//     }

//     public void display(){
//         Node curr=top;
//         if(top==null){
//             System.out.println("List is Empty");
//         }
//         else{
//             while(curr!=null){
//                 System.out.print(curr.data+" -> ");
//                 curr=curr.next;
//             }
//             System.out.println();
//         }
//     }
//     public void pop(){
//         if(top==null){
//             System.out.println("List is Empty");
//         }
//         top=top.next;
//     }
 
//    public static void main(String[] args) {
//     JavaDay18 j=new JavaDay18();
//     j.push(10);
//     j.push(20);
//     j.push(30);
//     j.display();
//     j.pop();
//     j.display();
//    }  
// }


//-----------------------------Queue Implementation ----------------------

// public class JavaDay18 {
//     class Node{
// 		int data;
// 		Node next;
// 		public Node(int d) {
// 			this.data=d;
// 			this.next=null;
// 		}
// 	}
//     public Node top=null;
//     public void push(int data){
//         Node n=new Node(data);
//         if(top==null){
//             top=n;
//         }
//         else{
//             n.next=top;
//             top=n;
//         }
//     }

//     public void display(){
//         Node curr=top;
//         if(top==null){
//             System.out.println("List is Empty");
//         }
//         else{
//             while(curr!=null){
//                 System.out.print(curr.data+" -> ");
//                 curr=curr.next;
//             }
//             System.out.println();
//         }
//     }
//     public void pop(){
//         if(top==null){
//             System.out.println("List is Empty");
//         }
//         top=top.next;
//     }
 
//    public static void main(String[] args) {
//     JavaDay18 j=new JavaDay18();
//     j.push(10);
//     j.push(20);
//     j.push(30);
//     j.display();
//     j.pop();
//     j.display();
//    }  
// }