package JavaClass;
import java.util.*;
public class JavaDay6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	//-----------------min and max-------------
		
//		int n=sc.nextInt();
//		int max=0,min=Integer.MAX_VALUE;
//		int [] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		double [] pow=new double[n];
//		for(int i=0;i<n;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//			pow[i]=Math.pow(2,arr[i]);
//		}
//		System.out.println("Min : "+min);
//		System.out.println("Max : "+max);
//		for(int i=0;i<n;i++) {
//			System.out.println((long)pow[i]);
//		}
		
	//-------------Count How many times the record has broken--------------
		
//		int n=sc.nextInt();
//		int max=0,min=Integer.MAX_VALUE;
//		int best=0,worst=0;
//		int [] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//				worst++;
//			}
//			if(min>arr[i]) {
//				min=arr[i];
//				best++;
//			}
//
//		}
//		worst--;
//		best--;
//		System.out.println("Best Record Count : "+best);
//	 	System.out.println("Worst Record Count : "+worst);
	 	
	 //------------------ Count the pairs divisible by n-----------------
	 	
//	 	int n=sc.nextInt();
//		int [] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int t=sc.nextInt();
//		int count=0;
//		for(int i=0;i<n;i++) {
//			if(i<n-1 && (arr[i]+arr[i+1])%t==0 ) {
//				count++;
//			}
//		}
//		System.out.println("Count : "+count);
		
	//------------------Find Who will escape from the Mafia--------
		
//		int n=sc.nextInt();
//		int gun=sc.nextInt();
//		int pos=sc.nextInt();
//		int ans=gun+pos-1;
//		if(ans%n==0) {
//			System.out.println(n);
//		}
//		else {
//			System.out.println(ans%n);
//		}
		
//		Input  : n = 8 , gun = 4 , pos = 4
//		Output : 7
		
	//-------------------2 D Array-------------------
		
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=new int[r][c];
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("The Given Matrix is :");
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	//-------------------Diagonal Difference-----------
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int di1=0,di2=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j) {
					di1+=arr[i][j];
				}
				if((i+j)==r-1) {
					di2+=arr[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(Math.abs(di1-di2));
	}  

}
