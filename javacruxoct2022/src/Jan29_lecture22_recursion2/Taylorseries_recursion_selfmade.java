package Jan29_lecture22_recursion2;

public class Taylorseries_recursion_selfmade {
	/*
	 e^x=1+x+x^2/2!+x^3/3!+x^4/4!+....n terms
	 */
	/*
	 sum=1+2+3...+n=sum(n-1)+n
	 fact(n)=fact(n-1)+n
	 power=power(m,n)*m*/
	public static float p=1;
	public static float f=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x=4,n=10;
		System.out.println(e(x,n));
	}

//		public static float e(float x,float n)
//		{
//		
//		float r;
//		if(n==0)
//			return 1;
//		else
//		{
//			r=e(x,n-1);
//			p=p*x;
//			f=f*n;
//			return r+p/f;
//		}
//}
	//Taylor series using Horners Rule given below
	//e^x=1+x/1(1+x/2(1+x/3(1+x/4)))
	//processing done at calling time 
//	public static float e(float x,float n)
//	{
//		float s=1;
//		for(;n>0;n--)
//		{
//			s=1+x/n*s;
//		}
//		return s;
//	}
/*
 	public static float e(float x,float n)
 	{ 
 	double s=1;int i;double num=1;double den=1;
 	for(i=1;i<=n;i++)
 	{
 	num*=x;
 	den*=i;
 	s+=num/den;
 	}
 	return s;
 	}

 
 */
	//now will do by recursion
	public static float s=1;

	public static float e(float x, float n)
	{// storing value at calling time
		 if(n==0)
			 return s;
		 s=1+x/n*s;
		 return e(x,n-1);
	}
	
	
	
}

	