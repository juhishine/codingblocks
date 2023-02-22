package javacrux2022_lecture7_Datatype;

import java.util.Scanner;

public class Data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		byte b=(byte)(191);
		System.out.print(b);
		//191 to (10111111) (msb is 1 that means its negative) to 2s complement (01000001) = -65	
		int a=10;// hard code value or literal 
		//b=a; // implicit is indirect , explicit is direct
		b=(byte)(a);// explicit typecasting
		b=10;   // implicit typecasting 
		//long l=282981919; // its 9 digit no., no error ,integer range is 10 ki power 9
		//long l=2829819193;// shows error, literal is everytime by default integer , add l at end
		long k=sc.nextLong();
		long l=2829819193L;// explicit typecasting 
		double d=8.9;// in floating type , literal is always double type
		//float f =8.9;// error
		
		boolean b1=true;
		boolean b2=false;// write in small letter
		float f =8.9f;
		System.out.println(k);
		System.out.print(f);
		
		}

}
