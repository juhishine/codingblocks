package feb4_javacrux2022_lecture23_Recursion3;
import java.util.*;

public class numberof1mmorethan0_printnbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Scanner sc=new Scanner(System.in);
		int one=0,zero=0;
		String op="";
		solve(one,zero,n,op);

	}
	public static void solve(int one,int zero,int n, String op)
	{
		if(n==0)
		{System.out.println(op);
		return;
		}
		solve(one+1,zero,n-1,op+"1");//op me 1 ki choice hamesha hai,count ka 1 bad jayega
		if(one>zero)
		{
			solve(one,zero+1,n-1,op+"0");
		}
		
		
		
		
	}

}
