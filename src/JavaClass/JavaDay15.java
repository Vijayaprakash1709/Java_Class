package JavaClass;
import java.util.*;

//----------------- Exception Handling -----------------

public class JavaDay15 {
		static void demo(int n) {
			if(n>10) {
				try {
					throw new ArithmeticException();
				}
				catch(ArithmeticException e ) {
					System.out.println("We Got an Error : " + e);
		}}}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);			
			int n=sc.nextInt();
			demo(n);
}}