package Jan29_lecture22_recursion2;

public class Subsequenceway2 {
	public static void main(String[] args) {
       String s="abc";
		System.out.println("\n"+subsequence(s,""));
	}
	static int count=0;//its in heap
	public static int subsequence(String input,String output){
    //chote se start karna hai , a-> a, space
		if(input.length()==0)
			{
			 System.out.println(output+" ");
		     return 1;
			}
		char ch=input.charAt(0);
		int a1=subsequence(input.substring(1),output);
		int b1=subsequence(input.substring(1),output+ch);
		return a1+b1;
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

