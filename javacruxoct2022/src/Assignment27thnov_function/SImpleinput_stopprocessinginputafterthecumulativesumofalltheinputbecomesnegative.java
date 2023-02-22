package Assignment27thnov_function;
import java.util.*;

public class SImpleinput_stopprocessinginputafterthecumulativesumofalltheinputbecomesnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int sum=0;int n;
//		Scanner sc=new Scanner(System.in);
//		while(sum>=0)
//		{
//			n=sc.nextInt();
//			sum+=n;
//          
//		}
//		System.out.println(sum);
	
		    
		int sum=0;
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			sum = sum + n;
			if(sum>=0){
				System.out.println(n);
			}
			else{
				break;
			}
		
		} 
    }
}