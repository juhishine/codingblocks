package leetcode_string_8thjan;

import java.util.Scanner;

public class LongestsubstringWithoutRepeatingCharacters_leetcode_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  System.out.println(s);
      System.out.println(longestsubstring(s));
	}
	public static int longestsubstring(String s)
	{   
		int start = 0;
        int end = 0;
        int[] chars = new int[128];  int array created, with value stored 0 in all array 
        int maxLen = 0;
		while(end < s.length()){ // 0<6,1<6,2<6

            char currChar = s.charAt(end); //currChar=p ,currchar=w,currchar=w
            if(chars[currChar] == 0)
            {   //chars[p]==0// chars[w]==0
                chars[currChar] = 1;   //chars[p]=1 //chars[w]=1
                end += 1;                //end=1  //end=2
            }
            else{
                while(chars[s.charAt(end)] > 0){  //chars[p]>0 //yes //1>0//1>0
                    chars[s.charAt(start)] = 0;    //chars[p]=0
                    start += 1;           //start=1
                }
            }
            maxLen = Integer.max(maxLen, end - start);  //0,1-0=1
        }
		return maxLen;
	}
}
