package JavaClass;
import java.util.*;
public class JavaDay5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	//---------------Triangle---------------
		
//	 	  int n=sc.nextInt();
//    	  int space=n-1;
//    	  for(int i=0;i<n;i++) {
//    		  
//    		  for(int j=0;j<space;j++) {
//    			 System.out.print(" ");
//    		  }
//    		  for(int k=space;k<n+i;k++) {
//    			  System.out.print("*");
//    		  }
//    		  space--;
//    		  System.out.println();
//    	  }
    
    //---------------Apple Problem--------------
    	  
//    	  int n=sc.nextInt();
//    	  int a=sc.nextInt();
//    	  int temp=a;
//    	  while(a>0) {
//    		  n=(int)n/2;
//    		  n--;
//    		  a--;
//    	  }
// 
//    	  System.out.println(n);
//    	  if(n==1) {
//    		  System.out.println("Yes");
//    	  }
//    	  else{
//    		System.out.println("No");
//    	  }
    
	//---------------Reverse Pyramind-------------
		
//	 	  int n=sc.nextInt();
//    	  int space=0;
//    	  for(int i=n-1;i>=0;i--) {
//    		  
//    		  for(int j=space;j>0;j--) {
//    			 System.out.print(" ");
//    		  }
//    		  for(int k=n+i;k>space;k--) {
//    			  System.out.print("*");
//    		  }
//    		  space++;
//    		  System.out.println();
//    	  }
    	  
    //---------------Another method for Inverted Pyramid----------
    	  
    	  int n=sc.nextInt();
    	  for(int i=n-1;i>=0;i--) {
    		  for(int j=n-1;j>i;j--)
    			  System.out.print(" ");
    		  for(int j=0;j<2*i+1;j++) {
    			  System.out.print("*");
    		  }
    		  System.out.println();
    	  }
    	  

	}

}
