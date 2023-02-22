package Jan28th_Lecture21_Recursion;

public class print1to5_Headrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printincreasing(n);

	}
	public static void printincreasing(int n)
	{   
		if(n==0)
			{
			return ;
			}
         printincreasing(n-1);//n=5=>PI(4)
       //n=4=>PI(3)
       //n=3=>PI(2)
       //n=2=>PI(1)
       //n=1=>PI(0)
		 System.out.println(n);

      
	}
}
