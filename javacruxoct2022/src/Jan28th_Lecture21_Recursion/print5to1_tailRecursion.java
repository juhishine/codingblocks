package Jan28th_Lecture21_Recursion;

public class print5to1_tailRecursion {
	/*Tail recursion is better than head recusion.Tail recursion in which function call is last only that work */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printdecreasing(n);

	}
	public static void printdecreasing(int n)
	{   
		if(n==0)
			{return ;
			}
		 System.out.println(n);
	       printdecreasing(n-1);


      
	}
}
