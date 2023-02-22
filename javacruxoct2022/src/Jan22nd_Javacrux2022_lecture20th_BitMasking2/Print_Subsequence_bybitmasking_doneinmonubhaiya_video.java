package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

public class Print_Subsequence_bybitmasking_doneinmonubhaiya_video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 logic modify cba =000=_,
		 001=a,
		 010=b,
		 011=ab,
		 100=c,
		 101=ac,
		 110=bc,
		 111 =abc, ulta lenge , nhi ca aajayega , jo ki subsequence nhi hai
		 abc, pos lenge a se, in 101, right bit lenge 
		 bit piche se dekhoge konsi on hai , fir abc ke start se wo print kar loge
		 head tail wala question bhi aise hojayega */
		String str="abc";
		PrintSub(str);
	}
	public static void PrintSub(String str)
	{		int n=str.length();
		for(int i=0;i<(1<<n);i++)// loop chalega 0=000,1==001,2=010,3,4,5,6,7
		{
			Pattern(i,str);}	
	}
	public static void Pattern(int i,String str)
	{
		int pos=0;
		while(i!=0)
		{
			if((i&1)!=0)//last bit 1 hai ki nhi uske liye
			{System.out.print(str.charAt(pos));
			}
			i>>=1;//move right 
		pos++;
		}
		System.out.println();
		
	}

}
