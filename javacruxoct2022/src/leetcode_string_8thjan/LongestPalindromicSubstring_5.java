package leetcode_string_8thjan;

public class LongestPalindromicSubstring_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i+1; j < s.length(); j++) {
//				String str=s.substring(i,j);
//			    if(ispalindrome(s)==true)
//			    {System.out.print(s);}
//			}
//		}
//	}
//	public static boolean ispalindrome(String s)
//	{  int count=0;
//		int i=0;int j=s.length()-1;
//		while(i<j)
//		{  if(s.charAt(i)==s.charAt(j))
//			{
//			System.out.print(s.substring(i,j));
//			i++;
//			j--;
//			count++;
//			}
//		else
//		{return false;
//		
//		}
//		}return true;
//		
//	}
//}
		int max=0,ans=0;
		
	      for(int i=0;i<s.length();i++)
      {
          int odd=count(i,i,s);
	          int even=count(i,i+1,s);
          ans+=odd+even;
          max=Math.max(max,ans);
      }  
	      System.out.println(s.substring(max));
	}
	    public static int count(int start, int end, String s)
	    {
	        int ans=0;
	        while(start>=0&&end<s.length())
	        {
	            if(s.charAt(start)==s.charAt(end))
	            { System.out.println(s.substring(start,end));
	            start--;
	            end++;
            ans++;
            }
	            else 
	            {break;}
	        }
	        return ans;
	    }
	}