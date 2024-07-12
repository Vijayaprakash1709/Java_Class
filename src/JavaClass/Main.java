package JavaClass;
// import java.util.*;
// public class Main{
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
// 			tail.next=newNode;
// 			tail=newNode;
// 		}
// 	}
//     public int fib(int n){
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         return fib(n-1)+fib(n-2);
//     }
    	
// 	public void display(int pos) {
// 		Node curr=head;
// 		if(head==null) {
// 			System.out.println("The list is Empty");
// 		}
// 		else {
//             pos--;
// 			while(pos-->0) {
//                 System.out.print(curr.data+" ");
// 				curr=curr.next;
// 			}
// 			System.out.print(fib(curr.data));
//             while(curr!=null){
//                 System.out.print(curr.data+" ");
//                 curr=curr.next;
//             }
// 		}
// 	}
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Main list=new Main();
//         while(true){
//             int n=sc.nextInt();
//             if(n==-1){
//                 break;
//             }
//             list.addNode(n);
//         }
//         int pos=sc.nextInt();
//         list.display(pos);
//     }
// }



// import java.util.*;
// public class Main{
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
//             System.out.print("Merged, Sorted, and Deduplicated List: ");
// 			while(curr!=null) {
// 				System.out.print(curr.data+" -> ");
// 				curr=curr.next;
// 			}
// 			System.out.println("null");
// 		}
// 	}
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Main m=new Main();
//         Set<Integer> s=new TreeSet<>();
//         while(true){
//             int k=sc.nextInt();
//             if(k==-1){
//                 break;
//             }
//             s.add(k);
//         }
//          while(true){
//             int k=sc.nextInt();
//             if(k==-1){
//                 break;
//             }
//             s.add(k);
//         }
//         for(int i:s){
//             m.addNode(i);
//         }
//         m.display();

//     }
// }

// import java.util.*;
// public class Main{
// 	public static void main(String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		int count=0;
// 		while(true){
// 			int k=sc.nextInt();
// 			if(k==-1){
// 				break;
// 			}
// 			count++;
// 		}
// 		System.out.println((int)Math.pow(2,count)-1);
// 	}
// }


//avl tree
// import java.util.*;
// public class Main{
//     class Node{
//         int data;
//         Node left;
//         Node right;
//         int height;
//         public Node(int d){
//             this.data=d;
//             this.left=null;
//             this.right=null;
//             this.height=1;
//         }
//     }
//     public Node root=null;
  
//     //insert into avl tree
//     public Node insert(Node root,int data){
//         if(root==null){
//             root=new Node(data);
//             return root;
//         }
//         if(data<root.data){
//             root.left=insert(root.left,data);
//         }
//         else if(data>root.data){
//             root.right=insert(root.right,data);
//         }
//         root.height=Math.max(height(root.left),height(root.right))+1;
//         int balance=balance(root);
//         if(balance>1 && data<root.left.data){
//             return rightRotate(root);
//         }
//         if(balance<-1 && data>root.right.data){
//             return leftRotate(root);
//         }
//         if(balance>1 && data>root.left.data){
//             root.left=leftRotate(root.left);
//             return rightRotate(root);
//         }
//         if(balance<-1 && data<root.right.data){
//             root.right=rightRotate(root.right);
//             return leftRotate(root);
//         }
//         return root;
//     }
    
//     public int height(Node root){
//         if(root==null){
//             return 0;
//         }
//         return root.height;
//     }
  
//     public int balance(Node root){
//         if(root==null){
//             return 0;
//         }
//         return height(root.left)-height(root.right);
//     }
   
//     public Node rightRotate(Node y){
//         Node x=y.left;
//         Node t2=x.right;
//         x.right=y;
//         y.left=t2;
//         y.height=Math.max(height(y.left),height(y.right))+1;
//         x.height=Math.max(height(x.left),height(x.right))+1;
//         return x;
//     }
    
//     public Node leftRotate(Node x){
//         Node y=x.right;
//         Node t2=y.left;
//         y.left=x;
//         x.right=t2;
//         x.height=Math.max(height(x.left),height(x.right))+1;
//         y.height=Math.max(height(y.left),height(y.right))+1;
//         return y;
//     }
   
//     public void inOrder(Node root){
//         if(root==null){
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data+" ");
//         inOrder(root.right);
//     }
   
//     public void preOrder(Node root){
//         if(root==null){
//             return;
//         }
//         System.out.print(root.data+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }
    
//     public void postOrder(Node root){
//         if(root==null){
//             return;
//         }
//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.print(root.data+" ");
//     }   
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Main m=new Main();
//         while(true){
//             int k=sc.nextInt();
//             if(k==-1){
//                 break;
//             }
//             m.root=m.insert(m.root,k);
//         }
//         m.inOrder(m.root);
//     }
// }


// import java.util.Scanner;

// public class Main {
//     class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     Node head = null;
//     Node tail = null;

//     public void AddNode(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//     }

//     public void Display2() {
//         Node current = tail;
//         if (head == null) {
//             System.out.println("The list is empty");
//             return;
//         }
  
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.prev;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Main sc = new Main();
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();
//         int a;
//         while (n-->0) {
//             a=s.nextInt();
//             sc.AddNode(a);
//         }
//         sc.Display2();   
//     }}

//sort funtion in doubly linked list
// import java.util.Scanner;
//only function

// public void sort() {
//     Node current = null, index = null;
//     int temp;
//     if (head == null) {
//         return;
//     } else {
//         for (current = head; current.next != null; current = current.next) {
//             for (index = current.next; index != null; index = index.next) {
//                 if (current.data > index.data) {
//                     temp = current.data;
//                     current.data = index.data;
//                     index.data = temp;
//                 }
//             }
//         }
//     }
// }2 1 3 4 5 6 7 8 9 2-1
//use while loop

// import java.util.*;
// public class Main{
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
// 			tail.next=newNode;
// 			tail=newNode;
// 		}
// 	}
	
// 	public void display(int count) {
// 		Node curr=head;
// 		if(head==null) {
// 			System.out.println("The list is Empty");
// 		}
// 		else {
//             int repeat=0,sum=0;
//             int temp=head.data;
//             while(count-->0){
//                 sum=sum+temp;
//                 temp++;
//             }
//             int sum2=0;
// 			while(curr.next!=null) {
// 				if(curr.data==curr.next.data){
//                     repeat=curr.data;
//                 }
//                 else 
//                 sum2=sum2+curr.data;
//                 curr=curr.next;
// 			}
//             sum2=sum2+curr.data;
//             sum=sum-sum2;
//             System.out.print(repeat+" "+sum);
			
// 		}
// 	}
//      public void sort() {
//     Node current = head, index = null;
//     int temp;
//     if (head == null) {
//         return;
//     } else {
//         while (current != null) {
//             index = current.next;
//             while (index != null) {
//                 if (current.data > index.data) {
//                     temp = current.data;
//                     current.data = index.data;
//                     index.data = temp;
//                 }
//                 index = index.next;
//             }
//             current = current.next;
//         }
//     }
// }
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     Main m=new Main();
//     int count=0;
//     while(true){
//         int k=sc.nextInt();
//         if(k==-1){
//             break;
//         }
//         m.addNode(k);
//         count++;
//     }
//     m.sort();
//     m.display(count);
// }
// }
// // write a function to display the equilibrium index
// public void display() {
//         Node curr=head;
//         if(head==null) {
//             System.out.println("The list is Empty");
//         }
//         else {
//             int sum=0;
//             int leftsum=0;
//             while(curr!=null){
//                 sum=sum+curr.data;
//                 curr=curr.next;
//             }
//             curr=head;
//             while(curr!=null){
//                 sum=sum-curr.data;
//                 if(leftsum==sum){
//                     System.out.print(curr.data+" ");
//                 }
//                 leftsum=leftsum+curr.data;
//                 curr=curr.next;
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         Main m=new Main();
//         while(true){
//             int k=sc.nextInt();
//             if(k==-1){
//                 break;
//             }
//             m.addNode(k);
//         }
//         m.display();
//     }
// }

