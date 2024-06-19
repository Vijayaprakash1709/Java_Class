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
    	  
    //---------------Diamond Pattern ----------
    	  
//    	  int n=sc.nextInt();
//    	  for(int i=0;i<n;i++) {
//    		  for(int j=n-1;j>i;j--)
//    			  System.out.print(" ");
//    		  for(int j=0;j<2*i+1;j++) {
//    			  System.out.print("*");
//    		  }
//    		  System.out.println();
//    	  }
//    	  for(int i=n-2;i>=0;i--) {
//    		  for(int j=n-1;j>i;j--)
//    			  System.out.print(" ");
//    		  for(int j=0;j<2*i+1;j++) {
//    			  System.out.print("*");
//    		  }
//    		  System.out.println();
//    	  }
    	  
    //----------------1,121,12321 Pattern--------
		
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print(j);
//			}
//			for(int k=i+1;k>0;k--) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
	//-----------------K Number Patten ---------
		
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i+1;j<=n;j++) {
//				System.out.print(j);
//			}
//			
//		System.out.println();
//		}
//		
//		for(int i=n-2;i>=0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i+1;j<=n;j++) {
//				System.out.print(j);
//			}
//			
//		System.out.println();
//		}

		
	//----------Bitwise Pattern ---------------
	
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j%2);
//			}
//		System.out.println();
//		}
		
	//----------------
		
//		int n=sc.nextInt();
//	    int[] arr=new int[n];
//	    for(int i=0;i<n;i++) {
//	    	arr[i]=sc.nextInt();
//	    }
//	    for(int i=0;i<n;i++) {
//	    	if(arr[i]<38){
//	    		System.out.println(arr[i]);
//	    	}
//	    	else {
//	    		if(arr[i]%5>=3) {
//	    			arr[i]=arr[i]+(5-arr[i]%5);
//	    		}
//	    		System.out.println(arr[i]);
//	    	}
//	    }
		
	//-------------Adam number------------
		
		int n=sc.nextInt();
		int t=n,power1=n*n;
		int second=0;
		while(n>0) {
			second=(second*10)+(n%10);
			n/=10;
		}
		int power2=second*second;
		int sq2=0;
		while(power2>0) {
			sq2=(sq2*10)+(power2%10);
			power2/=10;
		}
		if(sq2==power1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
    	  
	}

}
