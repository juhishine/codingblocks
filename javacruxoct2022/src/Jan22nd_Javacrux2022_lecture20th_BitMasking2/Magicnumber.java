package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

public class Magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Magic number
 5,25,30,125,150,155,625,630,650,655
 *
 * input :n=2, output-25
 * iput:n=5, output-130
 Asked in amazon 
 * */
	
	int n=11;
	System.out.println(Nthmagicnumber(n));
	}
	public static int Nthmagicnumber(int n)
	{int ans=0;
	int mul=5;
	while(n!=0)
	{
      if((n&1)!=0)
    { ans=ans+mul;
	}
      mul=mul*5;
      n>>=1;//n=n>>1
    }
	return ans;
 }
}