package javacrux2022_lecture7_Datatype;
import java.util.*;

public class char_Data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// char 26 small char, 26 bigger char , java has char =2 byte, 2 ki power 8 that is 256
		//A=65( integer value) //B=66...a=97,b=98,c=99.... '1'=49,'2'=50...
		Scanner sc=new Scanner(System.in);
		char ch='a';
		int i=1;
		char ch1=sc.next().charAt(0);
		ch++;// ch=(char)(ch+1); implicit typecast , it is done itself
		System.out.print(ch);
		//ch=ch+1;// it will give error
		ch1=(char)(ch1+1);
		System.out.println(ch1);
//		char c=sc.next().charAt(0);
//		c+=10;
//		System.out.println(c);
		
	}

}
