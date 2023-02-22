package javacrux2022_lecture8;

public class parametrisedfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a=7;
		int b=9;
		Addition(a,b);
		System.out.println("Hello");
		
	}
	public static void Addition(int a,int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		sub(c,a);// function calling 
		System.out.println(c);

	}
	public static void sub(int a,int b)
	{int c=a-b;
	System.out.println(c);

	}

}
