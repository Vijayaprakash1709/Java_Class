package JavaClass;
import java.util.*;

class Paren{
	public void demo(int n) {
		System.out.println("Demo in parent Class "+n);
	}
}
class Child extends Paren {
	public void demo(int n){
		System.out.println("Demo in child Class "+n);
	}
}
public class JavaDay13 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Child c=new Child();
		c.demo(n);
		

	}

}
