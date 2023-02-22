package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class lexicographicallywhichstringisbig {//stringcompare

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(s1.compareTo(s2));
		System.out.println(Compare(s1,s2));
	}
	public static int Compare(String s1,String s2) {
		int len=Math.min(s1.length(), s2.length());
		//min isliye liya kyunki max lenge to out of bound chale jayega
		for(int i=0;i<len;i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
			
		}
		return s1.length()-s2.length();
//		if(s1.length()>s.length())
//			{
//		for(int i=0;i<s1.length();i++)
//			if(s.substring(0,i)>s1.substring(0,i))
//				System.out.println(s);
//		break;
//			}
//		else
//			for(int i=0;i<s.length();i++)
//				{if(s1.substring(0,i)>s.length())
//					System.out.println(s1);
//				break;
//				}
//			

	}

}
