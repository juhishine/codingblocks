package Assignment27thnov_function;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies 
		between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.*/
		Scanner sc =new Scanner(System.in);
		char a=sc.next().charAt(0);
		int b=(int)a;
		lu(a);

	}
	public static void lu(int b) 
	{
	     
		if(b>=65 && b<=90) 
			System.out.print("Uppercase");
		else if(b>=97 && b<=122)
			System.out.print("Lowercase");
		else 
			System.out.print("Invalid");
	}

}
