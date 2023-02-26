package feb11_javacrux2022_Lecture24_Recursion4;

public class pathdicevalues_1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int des=4;
		int curr=0;
		System.out.println("\n"+printpath(curr,des,""));
}
	public static int printpath(int cur,int des,String ans)
	{
	                if(cur==des)
	                {  
	                	System.out.println(ans+" ");
	                    return 1;
	                }
	                if(cur>des)
	                {
	                	return 0;
	                }
//	                int a=printpath(cur+1,des,ans+1);
//	                int b=printpath(cur+2,des,ans+2);
//	                int c=printpath(cur+3,des,ans+3);
//	                return a+b+c;
	                int count =0;
	                for(int dice=1;dice<=3;dice++)
	                {
	                	count=count+printpath(cur+dice,des,ans+dice);
	                }
	              return count;
	 }
}