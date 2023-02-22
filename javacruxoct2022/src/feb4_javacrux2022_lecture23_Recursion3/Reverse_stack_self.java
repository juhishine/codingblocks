package feb4_javacrux2022_lecture23_Recursion3;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_stack_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<>();//stack declaration
		for(int i=0;i<n;i++) {
			int ae = sc.nextInt();
			s.push(ae);//pushing element in stack
		}
		reverse(s);	
		System.out.println(s);
	}
	public static void reverse(Stack<Integer> s)
	{
		if(s.size()==1)
			return ;
		int temp=s.peek();
		s.pop();
		reverse(s);
		insert(s,temp);
		return;
		
	}
	public static void insert(Stack<Integer> s, int temp) {
		if(s.size()==0||s.peek()<=temp) {
			s.push(temp);
			return;
		}
		int val = s.peek();//take another value from stack
		s.pop();//small the size of stack
		insert(s,temp);
		s.push(val);
	}

}
