package feb4_javacrux2022_lecture23_Recursion3;

import java.util.Scanner;

public class Lettercasechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();//digits are included and any case possible
		String op="";
		letterCaseChange(ip,op);
	} 
	public static void letterCaseChange(String ip,String op){//a1B2,""
		if(ip.length()==0)
		{
			System.out.println(op);
			return;
		}
		char ch=ip.charAt(0);
		if(Character.isDigit(ch))// if its a digit ,just add the digit
		letterCaseChange(ip.substring(1),op+ch);
		else
		{
		letterCaseChange(ip.substring(1),op+Character.toUpperCase(ch));
		letterCaseChange(ip.substring(1),op+Character.toLowerCase(ch));
		}

		
	}
}
/*
 a1B2
 -----
 a1b2
 a1B2
 A1b2
 a1B2*/
