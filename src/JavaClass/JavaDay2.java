package JavaClass;
import java.util.*;
public class JavaDay2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//-----------------input from the user-------------
	
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	System.out.println(a+b);
	
//	char c=sc.next().charAt(0);
	
//	System.out.println(c);
	
	// -------------------next Line error----------------- 
	
//	int n=sc.nextInt();
//	sc.nextLine();
//	String s=sc.nextLine();
//	System.out.println(n+"\n"+s);
//	
	
   //---------------relational operator------------------ 
	
//	int a=sc.nextInt();
//	if(a!=10) {
//		System.out.println("Yes");
//	}
//	else {
//		System.out.println("No");
//	}
	
	//----------------unary operator example-----------
	
//	int a=sc.nextInt();
//	System.out.println(a++);
//	System.out.println(++a);
//	System.out.println(a--);
//	System.out.println(--a);
	
	//---------------logical Operators----------------
	
	        //-------AND-------
	
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	if(a>=b && a!=b) {
//		System.out.println("Yes");
//	}
//	else {
//		System.out.println("No");
//	}
	
	            //------OR-------
	
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	if(a>=b || a!=b) {
//		System.out.println("Yes");
//	}
//	else {
//		System.out.println("No");
//	}
	
	//---------------bitwise operator -------------------
	
//	int a=sc.nextInt();
//	int c=10<<2;
//	System.out.println(c);
	//---------------if else---------------------------------
	int mark=sc.nextInt();
	if(mark>100) {
		System.out.println("Enter Valid mark");
	}
	else if(mark>=90) {
		System.out.println("A Grade");
	}
	else if(mark>=80) {
		System.out.println("B Grade");
	}
	else if(mark>=70) {
		System.out.println("C Grade");
	}
	else if(mark>=60) {
		System.out.println("D Grade");
	}
	else if(mark>=50) {
		System.out.println("E Grade");
	}
	else {
		System.out.println("Fail");
	}
	
	
	
	
	sc.close();
	
	
}
}
