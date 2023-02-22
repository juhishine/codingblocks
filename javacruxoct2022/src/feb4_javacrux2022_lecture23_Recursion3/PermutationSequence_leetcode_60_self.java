package feb4_javacrux2022_lecture23_Recursion3;

public class PermutationSequence_leetcode_60_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String op="";
	      gp(3,op);
}
	public static void gp(int n,String op)
	{
	                if(n==0)
	                {  
	                	System.out.println(op);
	                    return ;
	                }
	                if(op.length()==0||op.charAt(op.length()-1)!='1')
	                {gp(n-1,op+"1");}
	                if(op.length()==0||op.charAt(op.length()-1)!='2')
	                {gp(n-1,op+"2");}
	                if(op.length()==0||op.charAt(op.length()-1)!='3')
	                {gp(n-1,op+"3");}
	 }
}
/*
"123"
"132"
"213"
"231"
"312"
"321"
n=3,k=3 ,"213"
*/