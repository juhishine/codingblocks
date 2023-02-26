package feb4_javacrux2022_lecture23_Recursion3;

import java.util.ArrayList;

public class Generateparenthesis {
	/*amazon,microsoft,tictok,oranclefb,servicenow,infosys question*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
	int open =n,close=n;
	String temp="";
	//List<String> list=new List<>();
    ArrayList<String> list = new ArrayList<String>();
	gp(temp,list,open,close);
	System.out.println(list);
	}
	public static void gp(String temp,ArrayList<String> list,int open, int close)
	{ //temp is output
		//write base condition
		//Arraylist is passed by reference, opening choice milega , jab tak 0 na hojaye 
		if(open==0&&close==0)
		{
			list.add(temp);
			return;
		}
		if(open!=0)//open bracket choice milegi,, hamesha ,jab tak open 0 nhi ho jata 
			{
			list.add(temp+"(");
		     gp(temp,list,open-1,close);
		     }
		if(close>open)
		{
			list.add(temp+")");
			gp(temp,list,open,close-1);
		}
	}
	}
		 

	          
	        
//	    public static void Fun(int size, String temp,List<String> list,int open, int close)
//	        {
//	            if((open==close)&& (close==size))
//	             {     
//	            list.add(temp);
//	            return;
//	            }
//	            if(open==close)
//	        Fun(size,temp+"(",list,open+1,close);
//
//	        else if (open > close && open <size)
//	        {
//	            Fun(size,temp+"(",list,open+1,close);
//	            Fun(size,temp+")",list,open,close+1);
//	        }
//
//	        else if (open == size && close < size)
//	       Fun(size,temp+")",list,open,close+1);
//
//	    }
//	}
