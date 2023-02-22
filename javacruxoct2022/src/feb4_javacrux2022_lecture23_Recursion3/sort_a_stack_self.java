package feb4_javacrux2022_lecture23_Recursion3;
import java.util.*;

public class sort_a_stack_self {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Stack<Integer> s = new Stack<>();//stack declaration
			for(int i=0;i<n;i++) {
				int ae = sc.nextInt();
				s.push(ae);//pushing element in stack
			}
			sortStack(s);	
			System.out.println(s);
		}
		public static void sortStack(Stack<Integer> s) {
			if(s.size() == 1) return;
			int temp = s.peek();//takeout element from stack
			s.pop();
			sortStack(s);
			insert(s,temp);
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
