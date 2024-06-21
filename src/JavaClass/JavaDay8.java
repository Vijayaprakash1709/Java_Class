package JavaClass;
import java.util.*;
public class JavaDay8 {
	   public static int[] mergeArr(int a[],int b[]) {
		   int n=a.length;
		   int m=b.length;
		   int c[]=new int[n+m];
	       int i=0;
	       for(i=0;i<n;i++){
	           c[i]=a[i];
	       }
	       int k=0;
	       for(int j=n;j<n+m;j++){
	       c[j]=b[k];
	       k++;
	       }
	       return c;
	   }
	
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        int b[]=new int[m];
	        for(int i=0;i<m;i++){
	            b[i]=sc.nextInt();
	        }
	        int c[]=mergeArr(a,b);
	        Arrays.sort(c);
	        int i;
	        for(i=0;i<n+m-1;i++){
	            if(c[i]!=c[i+1]){
	                System.out.print(c[i]+" ");
	            }
	        }
	        System.out.print(c[n+m-1]);
	    }
	}


