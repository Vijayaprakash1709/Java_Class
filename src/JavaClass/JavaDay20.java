package JavaClass;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        data=item;
        right=left=null;
    }
}

public class JavaDay20 {
    Node root=null;
    public void insert(int data){
        root=insertRec(root,data);
    }
    public Node insertRec(Node troot,int data){
        if(troot==null){
            troot=new Node(data);
            return troot;
        }
        if(data<troot.data){
            troot.left=insertRec(troot.left,data);
        }
        else if(data>troot.data){
            troot.right=insertRec(troot.right,data);
        }
        return troot;

    }
    public void inOrder(Node root){
        if(root!=null){  
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        }
      }
    public static void main(String[] args) {
        JavaDay20 tree=new JavaDay20();
        tree.insert(50);
        tree.insert(35);
        tree.insert(45);
        tree.insert(55);
        tree.insert(43);
        tree.insert(88);
        tree.inOrder(tree.root);

        // System.out.println("Hello");
    }
}
