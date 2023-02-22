package feb4_javacrux2022_lecture23_Recursion3;

public class headtailprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		int n=3;
		printheadtail(s,n);
	}
	public static void printheadtail(String op,int n){
		//2calls for head and tail
		//jitna choice utni callein
		
		if(n==0)
		{
			
			System.out.println(op+" ");
			return;
			}
	printheadtail(op+"H",n-1);
	printheadtail(op+"T",n-1);
	}

}
