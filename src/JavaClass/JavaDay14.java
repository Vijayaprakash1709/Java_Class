package JavaClass;
import java.util.*;
//public class JavaDay14 {
//	static void demo() {
//		throw new ArithmeticException();
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//	//--------------------Exception Handling--------------
//		
//		try {
//		int n=sc.nextInt();
//		int b=sc.nextInt();
//		sc.nextLine();
//		String s=sc.nextLine();
//		System.out.println(n/b);
//		System.out.println(Integer.parseInt(s));
//		
//		}
//		catch(InputMismatchException exc) {
//			System.out.println(exc);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(NumberFormatException ex) {
//			System.out.println(ex);
//		}
//		finally {
//			System.out.println("Finally Block");
//		}
//		System.out.println("Code Ended Thank You !!!!!!!!");
//	}
//}

//----------------Throw Keyword -----------
public class JavaDay14 {
	static void demo(int n) {
		for(int i=0;i<n;i++) {
			try {
		throw new ArithmeticException();
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	//--------------------Exception Handling--------------
		
		int n=sc.nextInt();
		demo(n);
	}
}
