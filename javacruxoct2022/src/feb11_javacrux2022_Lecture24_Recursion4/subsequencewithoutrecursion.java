package feb11_javacrux2022_Lecture24_Recursion4;

public class subsequencewithoutrecursion {
	/*14-20lk paytm asked 
	 recursion nhi to bitmasking se hoga question
	 iterative is fast than recursive , bit masking is fast*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abc";
subsequencewithoutRecursion(s);
	}
	public static void subsequencewithoutRecursion(String s)
	{   int len=s.length();
		for(int i=0;i<(1<<len);i++)//len=5(101)=>10=>1(c)
		{
			 Pattern(i,s);
		}
	}
	public static void Pattern(int i,String s)
	{int pos=0;
		while(i!=0)
		{
			if((i&1)!=0)
			{
				System.out.print(s.charAt(pos));
			}
			pos++;
			i>>=1;
		}
		System.out.println();
	}

}
