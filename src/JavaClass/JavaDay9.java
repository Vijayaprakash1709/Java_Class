package JavaClass;
import java.util.*;
public class JavaDay9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	//-----------------Conversions----------------------- 
//		int n=sc.nextInt();
//		int t=n,a=n;
//		String s="";
//		//----------Decimal to Binary --------------
//		while(n>0) {
//			s=(char)n%2+s;
//			n/=2;
//		}
//		
//		//-------Octal to Decimal -------------
//		int sum=0,i=0;
//		while(t>0) {
//			sum=sum+(t%10)*(int)Math.pow(8, i);
//			i++;
//			t/=10;
//		}
//		//----------decimal to octal------------
//		String ans="";
//		while(a>0) {
//			ans=(char)a%8+ans;
//			a/=8;
//		}
//		
//		System.out.println(s);
//		System.out.println(sum);
//		System.out.println(ans);
		
	//-------------------Pole Arrange order----------
		
		String s=sc.nextLine();
		String ans="";
		String t="";
		for(int i=0;i<s.length();i+=2) {
			t="";
			t=t+s.charAt(i);
			t=t+s.charAt(i+1);
			ans=t+ans;
		}
		System.out.println(ans);
		
		
		
	}

}
