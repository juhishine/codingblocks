package Jan21st_Lectur19th_BitMasking;

public class Count_Set_Bit_tofindhowmanyoneinanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=84;//1010100
		System.out.println(Countset(n));
	}
	public static int Countset(int n)
	{
		int count=0;
		while(n>0)
		{if((n&1)!=0)
			{count++;}
		    n= n>>1;//worst case me 32 times chalega loop 
		}
		return count;
	}
}
