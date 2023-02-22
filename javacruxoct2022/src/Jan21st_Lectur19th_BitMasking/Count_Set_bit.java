package Jan21st_Lectur19th_BitMasking;

public class Count_Set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=84;//1010100
		System.out.println(Countset(n));
	}
	public static int Countset(int n)// fast way to count set bits 
	{
		int count=0;
		while(n>0)// or (n!=0)
		{
		n=(n&(n-1));
		count++;
		}
		return count;

	}

}
