package Assignment27thnov_function;
import java.util.*;

public class Replacethemall_replaceallthe0with5intheinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	    replace(n);
		}
	public static void replace(long b)
	{   if(b == 0){
	    System.out.println(5);
	    return;
	}
	    long mul=1; 
	    long sum=0;
	    while(b>0){
	    long rem=b%10;
		if(rem==0)
		{
			rem=5;
		}
		sum=sum+(rem*mul);
		mul=mul*10;
		b=b/10;
		}
		System.out.println(sum);	
		}
	}
