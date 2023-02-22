package jan8thjavacrux2022_lecture16_stringpart1;

import java.util.Scanner;

public class Findingcbnumber_assignmentques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    String s=sc.next();
		//String s="81615";
		PrintSubString(s);
	}
	public static boolean iscbnumber(long n) {
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		if(n==0||n==1)
			return false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				return true;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0) {
				return false;
			}
			
		}return true;
	}
	public static void PrintSubString(String s)
	{boolean[] visited=new boolean[s.length()];
	int count=0;
		for (int length= 1; length<=s.length(); length++) {
			for (int j = length; j <= s.length(); j++) {
				int i=j-length;
				String str=s.substring(i,j);
				System.out.println(str);
				Long.parseLong(str);//agar no.wali string bhejoge is function me , to wo usko long me convert 
				//karke dedga 
//Integer.parseInt(str);//string to int
				if(iscbnumber(Long.parseLong(str))==true && isvisited(visited,i,j-1)==true)
				{count++;
				for (int k = i; k < j; k++) {
					visited[k]=true;//marked as a cb number
				}}
}
		}
		System.out.println(count);
	}
	private static boolean isvisited(boolean[] visited,int si,int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <=ei; i++) {
			if(visited[i]==true)
			{return false;}
			
		}
return true;
	}

}
