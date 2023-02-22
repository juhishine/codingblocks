package Jan29_lecture22_recursion2;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		
		subsequence(s,"");
	}
	public static void subsequence(String input,String output){
    //chote se start karna hai , a-> a, space
		if(input.length()==0)
			{
			 System.out.println(output+" ");
		     return;
			}
		char ch=input.charAt(0);
		subsequence(input.substring(1),output);
		subsequence(input.substring(1),output+ch);
	}
	// base condition banti hai , tree ke last node se 

}
/*powerset, subsequence, all subset all are same 
//powerset is all subset of a set 
subset and power set are same
substring is contigous 
abc=a,b,c,ab,bc,abc =substring
ac=subsequence
subset =ac and ca is allowed 
substring =>subsequence=>subset (superset)    
 */

