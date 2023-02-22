package feb4_javacrux2022_lecture23_Recursion3;

public class consequent2Headnottoperintincoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		int n=3;
		printheadtail(s,n);
		//printheadtail(s,n,'-');
	}
//	public static void printheadtail(String ans,int n, char prev){
//		//2calls for head and tail
//		//jitna choice utni callein
//		
//		if(n==0)
//		{
//			
//			System.out.println(ans+" ");
//			return;
//			}
//		if(prev != 'H') {
//			printheadtail(ans+"H",n-1, 'H');
//		}
//	
//	printheadtail(ans+"T",n-1, 'T');
//	}
	public static void printheadtail(String ans,int n){
		//2calls for head and tail
		//jitna choice utni calls
		
		if(n==0)
		{
			
			System.out.println(ans+" ");
			return;
			}
		if(ans.length()==0||ans.charAt(ans.length()-1)!='H') {//ans.charAt(ans.length()-1)!='H',this checks previous character is 'H'
			printheadtail(ans+"H",n-1);
		}
	
	printheadtail(ans+"T",n-1);
	/*
	 *main(2,-)
	 *n=3,ans="-" =>PHT(2,H),PHT(2,T)
	 *n=2,ans="H"=>PHT(1,H)=>last character H nhi aye tabhi print hoga=>P(0,HT)
	 *n=2,ans="T"=>P(1,TH)=>last character H nhi aye tabhi print hoga ,P(1,TT)*/
	}

}