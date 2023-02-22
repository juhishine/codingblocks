package Jan28th_Lecture21_Recursion;

public class Ropecuttingintothreepieces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=23,a=11,b=9,c=12;
       System.out.println(maxpieces(n,a,b,c));
	}
	public static int maxpieces(int n,int a,int b, int c)
	{
    if(n==0)
	return 0;
    else if(n<0)
    	return -1;
    	int res=Math.max(maxpieces(n-a,a,b,c),maxpieces(n-b,a,b,c),maxpieces(n-c,a,b,c));
    if(res==-1)
    	return -1;
    return res+1;
	}

}
