package feb4_javacrux2022_lecture23_Recursion3;

import java.util.Scanner;

public class Permutationwithcasechanges {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String ip=sc.next();//ab
			String op="";
			permutationwithcasechange(ip,op);
		} 
		public static void permutationwithcasechange(String ip,String op){//ab,""
			if(ip.length()==0)
			{
				System.out.println(op);
				return;
			}
			char ch=ip.charAt(0);
			permutationwithcasechange(ip.substring(1),op+ch);
			permutationwithcasechange(ip.substring(1),op+Character.toUpperCase(ch));
			
		}
	}
