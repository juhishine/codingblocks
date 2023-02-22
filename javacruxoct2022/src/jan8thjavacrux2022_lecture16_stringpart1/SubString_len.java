package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class SubString_len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
				printlengthwise(s);
			}
			public static void printlengthwise(String s) {
				for (int length= 1; length<=s.length(); length++) {
					for (int j = length; j <= s.length(); j++) {
						int i=j-length;
						System.out.println(s.substring(i,j));
					}
				}
			}

		}
	