package feb11_javacrux2022_Lecture24_Recursion4;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String op = "";
		String ip = "abca";
		per(ip, op);
	}

	public static void per(String ip, String op) {
		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}
		for (int i = 0; i < ip.length(); i++) {
			char ch = ip.charAt(i);
			boolean flag = false;//to check any letter is matching 
			for (int j = i + 1; j < ip.length(); j++) {//to check any letter is matching 
				if (ip.charAt(j) == ch) {
					flag = true;
					break;
				}
			}
			if (!flag) {//bca pe challega 
				String s1 = ip.substring(0, i);
				String s2 = ip.substring(i + 1);
				per(s1 + s2, op + ch);
			}
		}

	}
}
*/

 String op = "";
		String ip = "abca";
		ArrayList<String> list=new ArrayList<>();
		per(op,ip,list);
        Collections.sort(list);
        int  i  = 0;
        while(i < list.size()) {
        	int j= i+1;
        	while(j < list.size() && list.get(i).equals(list.get(j))) {
        		j++;
        	}
        	System.out.println(list.get(i));
        	i=j;
        }
}
public static void per(String op,String ip, ArrayList<String> list)
{

          if(ip.length()==0)
          {  
          	list.add(op);
              return ;
          }
          //if(op.length()==0||op.charAt(op.length()-1)!='a')
          for (int i = 0; i < ip.length(); i++) {
				char ch=ip.charAt(i);
				String s1=ip.substring(0,i);
				String s2=ip.substring(i+1);
              String s3 =s1+s2;
              per(op+ch,s3, list);  
          }
         
          
          
}
}
/*recursion feb end
apr ending-graph
2d array and list -test
*/
	  		