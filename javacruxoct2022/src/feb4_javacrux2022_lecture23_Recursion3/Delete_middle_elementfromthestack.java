package feb4_javacrux2022_lecture23_Recursion3;

import java.util.Scanner;
import java.util.Stack;

public class Delete_middle_elementfromthestack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<>();//stack declaration
		for(int i=0;i<n;i++) {
			int ae = sc.nextInt();
			s.push(ae);//pushing element in stack
		}
		Delete(s);	
		System.out.println(s);
	}
	public static Stack<Integer> Delete(Stack<Integer> s)
	{ 
		if(s.size()==0)
			{
			return s;
			}
		int k=s.size()/2+1;
			solve(s,k);
			return s;
	}
	public static void solve(Stack<Integer> s,int k)
	{
		if(k==1)
			{
			s.pop();
		    return;
			}
		int temp=s.peek();
		s.pop();
		solve(s,k-1);
		s.push(temp);
		return;
		
	}
	/*
	 5
7
4
3
2
6
[7, 4, 2, 6]
*/

}
