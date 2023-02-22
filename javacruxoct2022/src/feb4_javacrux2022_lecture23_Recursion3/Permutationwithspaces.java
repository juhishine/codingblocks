package feb4_javacrux2022_lecture23_Recursion3;

import java.util.Scanner;

public class Permutationwithspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();//abc
		String op="";
		op+=ip.charAt(0);//a
		ip=ip.substring(1);//bc
		permutationwithspace(ip,op);
	} 
	public static void permutationwithspace(String ip,String op){//bc,a
		if(ip.length()==0)
		{
			System.out.println(op);
			return;
		}
		//char ch=op.charAt(0);
	permutationwithspace(ip.substring(1),op+""+ip.charAt(0));
	permutationwithspace(ip.substring(1),op+" "+ip.charAt(0));
	}

}
