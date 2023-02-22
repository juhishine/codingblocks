package feb11_javacrux2022_Lecture24_Recursion4;

import java.util.ArrayList;

public class Permutation_leetcode_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op="";
		String ip="abc";
		ArrayList<String> list=new ArrayList<>();
	      per(op,ip);
	     
		}
	public static void per(String op,String ip)
	{
		
	                if(ip.length()==0)
	                {  
	                	System.out.println(op);
	                    return ;
	                }
	                for (int i = 0; i < ip.length(); i++) {
						char ch=ip.charAt(i);
						String s1=ip.substring(0,i);
						String s2=ip.substring(i+1);
                        String s3 =s1+s2;
	                    per(op+ch,s3);  
	                }                
	 }
}
/*recursion feb end
apr ending-graph
2d array and list -test
 */
	  	