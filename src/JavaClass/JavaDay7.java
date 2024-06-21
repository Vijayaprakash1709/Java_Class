package JavaClass;
import java.util.*;
public class JavaDay7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	//----------------
		
//		int t=sc.nextInt();
//		int m=sc.nextInt();
//		int n=sc.nextInt();
//		int a=sc.nextInt();
//		int arr[][][][]=new int[t][m][n][a];
//		for(int i=0;i<t;i++) {
//			for(int j=0;j<m;j++) {
//				for(int k=0;k<n;k++) {
//					for(int l=0;l<a;l++) {
//						arr[i][j][k][l]=sc.nextInt();
//					}
//				}
//			}
//		}
//		for(int i=0;i<t;i++) {
//			for(int j=0;j<m;j++) {
//				for(int k=0;k<n;k++) {
//					for(int l=0;l<a;l++) {
//						System.out.print(arr[i][j][k][l]+" ");
//					}
//					System.out.println();
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
	//-----------------Theatre Formation-------------
		
//		System.out.println("Enter the no of Classes in the Theatre : ");
//		int t=sc.nextInt();
//		
//		System.out.println("Enter Row Value of the classes : ");
//		int m=sc.nextInt();
//		System.out.println("Enter Column Value of the classes : ");
//		int n=sc.nextInt();
//		int arr[][][]=new int[t][m][n];
//		System.out.println("Enter the Prices of all the seats : ");
//		for(int i=0;i<t;i++) {
//			for(int j=0;j<m;j++) {
//				for(int k=0;k<n;k++) {
//				arr[i][j][k]=sc.nextInt();
//				}
//				
//			}
//		}
//		System.out.println("Enter the Class You need : ");
//		int clas=sc.nextInt();
//		System.out.println("Enter the row you need ");
//		int row=sc.nextInt();
//		System.out.println("Enter the seat in row "+row+" : ");
//		int seat=sc.nextInt();
//		System.out.println("The Final Amount is : "+ arr[clas-1][row-1][seat-1]);
		
		
	//------------------count number of Digits----------------
		
		int n=sc.nextInt();
//		JavaDay7 obj=new JavaDay7();
		int ans=count(n);
		System.out.println(ans);	
	}
	public static int count(int n) {
		int ans=0;
		while(n>0) {
			ans++;
			n/=10;
		}
		return ans;
	}

}
