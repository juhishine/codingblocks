package Assignment_31stjan_bitmasking_and_recursion;
import java.util.*;

public class Playing_with_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int q=sc.nextInt();

	        for(int i=0;i<q;i++)
	        {
         int a=sc.nextInt();
         int b=sc.nextInt();
	        System.out.println(countsetbit(a,b));
	        }
		}
		public static int countsetbit(int a,int b){
		int count=0;int res=0;
      while(a<=b)	    
        {   
         int num=a++;
         while(num!=0)
	    {
	        if((num&1)!=0)
         {
             count++;
         }
	        num>>=1;
     //10=1010//11=1011//12=1100//13=1101//14=1110//15=1111
	    }	
			
     }
      res+=count;
      return res;
	}
	}
