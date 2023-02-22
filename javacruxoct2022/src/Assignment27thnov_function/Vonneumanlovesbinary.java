package Assignment27thnov_function;

import java.util.Scanner;

public class Vonneumanlovesbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary 
 is 7 in decimal.


Input Format
The first line contains N , the number of binary numbers. 
Next N lines contain N integers each representing binary representation of number.
        Sample Input
		4
		101
		1111
		00110
		111111

		Sample Output
		5
		15
		6
		63
		*/
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
vonNeumanLovesBinary(n);
	}
	public static void vonNeumanLovesBinary(int num)
	{
	
    Scanner sc=new Scanner(System.in);
    int value[]=new int[num];
         for(int i=0;i<num;i++)
         {
        	 int sum=sc.nextInt();
        	 int rema=0;int multiply=1;
 		     while(sum>0)
 		     {
 			rema=sum%10;           
 			value[i]+=rema*multiply;  
 			multiply=multiply*2;
 			sum=sum/10;
 		     }
        }
 		for(int j=0;j<num;j++)
 		{System.out.println(value[j]);
        }
    }
}
