package javacruxoct2022_lecture2;
import java.util.*;

public class Assignment_returnsthenumberoftimesdigitisfoundinthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rem;
        int count=0;
		Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(a!=0)
        {
                rem=a%10;  
                a=a/10; 
                if(rem== b)
                {
                    count++; 
                }   

        
        } System.out.println(count);

	}

}
