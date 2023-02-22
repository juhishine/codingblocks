package Jan28th_Lecture21_Recursion;

public class printoddandevendownsidenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		n=n*2;
		printoddandeven(n);

	}
	public static void printoddandeven(int n)
	{  
		if(n==0)
			return ;
		if(n%2==0)
		{
			System.out.println(n);
		}
		printoddandeven(n-1);
		if(n%2!=0)
		{System.out.println(n);
		}
	}
}
