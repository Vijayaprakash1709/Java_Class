package JavaClass;
import java.util.*;

//-----------Implementation of Singly Linked List------------

public class JavaDay16 {
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
			
//			newNode.next=head;
//			head=newNode;
			
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void display() {
		Node curr=head;
		if(head==null) {
			System.out.println("The list is Empty");
		}
		else {
			while(curr!=null) {
				System.out.print(curr.data);
				if(curr!=tail) {
					System.out.print(" -> ");
				}
				
				curr=curr.next;
			}
			System.out.println();
		}
	}
	
	public void insertFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void insertNth(int data,int pos) {
		Node newNode=new Node(data);
		Node curr=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			if(pos==1) {
				insertFirst(data);
			}
			else {
			int count=1;
			while(count<pos-1) {
				curr=curr.next;
				count++;
			}
			newNode.next=curr.next;
			curr.next=newNode;
			}
		}
	}
	
	public void insertLast(int data) {
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
	
	public static void main(String[] args) {
		JavaDay16 j=new JavaDay16();
		j.addNode(10);
		j.addNode(20);
		j.addNode(30);
		j.display();
		j.insertFirst(200);
		j.display();
		j.insertNth(60, 2);
		j.display();
		j.insertLast(43);
		j.display();
}}
