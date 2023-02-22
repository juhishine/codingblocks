package Assignment27thnov_function;
import java.util.*;
public class factorsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i=2;
		int sum =0;
		while(x>1){
		    if(x%i==0){
		        sum+=i;
		        x=x/i;
		    }
		    else{
		        i++;
		    }
		}
		System.out.print(sum);
	}
}
/*
 Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i=2;
		int sum =0;
		while(x>1){
		    if(x%i==0){
		        sum+=i;
		        x=x/i;
		    }
		    else{
		        i++;
		    }
		}
		System.out.print(sum);
	}
}
 */
