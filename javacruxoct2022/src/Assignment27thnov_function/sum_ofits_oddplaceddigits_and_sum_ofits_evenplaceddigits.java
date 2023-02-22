package Assignment27thnov_function;

import java.util.Scanner;

public class sum_ofits_oddplaceddigits_and_sum_ofits_evenplaceddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		sum_ofits_oddplaceddigits_and_sum_ofits_evenplaceddigit(n);

	}
	public static void sum_ofits_oddplaceddigits_and_sum_ofits_evenplaceddigit(long b)
	{   long count=0;
	long rem=0;
	long sumeven=0;
	long sumodd=0;
	
       while(b>0)
       {  rem=b%10;
       count++;
			if(count%2==0)
		{
			sumeven=sumeven+rem;
		}
		else 
		{
			sumodd=sumodd+rem;
		}
		 b=b/10;
		}
System.out.println(sumodd);
System.out.println(sumeven);

}

}
