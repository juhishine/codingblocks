package Selfmadenotes_1_7thnov;

import java.util.*;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sum();//1
    Scanner sc=new Scanner(System.in);//2
    int c=sc.nextInt();
    int d=sc.nextInt();
    add(c,d);
    double x=multiply();//3. value that is return get stored in x
    System.out.println("noargument, return value " + x);
    int u=sc.nextInt(); //4. no need to use scanner again 
    int v=sc.nextInt();
    int z=mul(u,v);
    System.out.println("with argument, have return type" + z);
	}
	
	public static void sum()//1. without arguments, no return type
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("without arguments, no return type " + (a+b));
	}
    public static void add(int x,int y)// 2.with arguments , no return type
    {
    	System.out.println("with argument method" + (x+y));
    }
    public static double multiply()//3.without argument, have return type
    {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	return (double)a*b;
    }
    public static int mul(int u, int v)// 4. With arguments, have return type
    {
    	return (u*v);
    }
}
