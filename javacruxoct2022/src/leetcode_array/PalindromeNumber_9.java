package leetcode_array;

public class PalindromeNumber_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=191;
		int count=0;
        int temp=x;
        int y=x;int rem,sum=0;
        while(x>0)
        {    count++; 
        x=x/10;     
        }
        while(temp>0)
        {
            rem=temp%10;
            sum=sum+rem*(int)Math.pow(10,--count);//0+1*(10,)
            temp=temp/10;
        }
        if(sum==y)
       System.out.println(true);
        else 
            System.out.println(false);
    }
}