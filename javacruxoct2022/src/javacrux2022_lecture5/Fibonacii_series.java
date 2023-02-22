package javacrux2022_lecture5;
import java.util.*;

public class Fibonacii_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{c=a+b;
		a=b;
		b=c;
		}
    System.out.print(a);//indexing zero se start hota hai 
	}

}
