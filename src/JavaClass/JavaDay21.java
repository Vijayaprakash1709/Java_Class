package JavaClass;
import java.util.*;
public class JavaDay21 {
    //inorder,preorder ad postorder
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
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    //insert function in binary search tree
    public Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    // find height of the tree

    public int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            int lheight=height(root.left);
            int rheight=height(root.right);
            if(lheight>rheight){
                return lheight+1;
            }
            else{
                return rheight+1;
            }
        }
    }

    //search an element in binary search tree
    public Node search(Node root,int data){
        if(root==null || root.data==data){
            return root;
        }
        if(root.data<data){
            return search(root.right,data);
        }
        return search(root.left,data);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
 