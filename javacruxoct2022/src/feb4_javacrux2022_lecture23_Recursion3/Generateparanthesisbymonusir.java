package feb4_javacrux2022_lecture23_Recursion3;
import java.util.ArrayList;
import java.util.List;

public class Generateparanthesisbymonusir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
List<String> ll = new ArrayList<String>();
generateparanthesis(n,0,0,"",ll);
System.out.println(ll);
	}
	public static  void generateparanthesis(int n,int open,int close,String ans,List<String> ll)
	{
		if(open==n&& close==n)
		{
		//System.out.print(ans+" ");
		ll.add(ans);
	    return;
	    }
		if(open<n)
		{
			generateparanthesis(n,open+1,close,ans+"(",ll);
		}
		if(close<open)
		{
			generateparanthesis(n,open,close+1,ans+")",ll);
		}
	}
}

