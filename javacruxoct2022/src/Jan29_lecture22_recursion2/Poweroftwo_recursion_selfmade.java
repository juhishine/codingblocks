package Jan29_lecture22_recursion2;

public class Poweroftwo_recursion_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
System.out.println(poweroftwo(n));
	}
	public static boolean ispoweroftwo(long n)
	{
		 if(n==0) return false;
		 if(n==1)return true;
	        return  (n%2==0 && ispoweroftwo(n/2));
		
	}

}
