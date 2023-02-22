package Jan28th_Lecture21_Recursion;

public class palindrome_String_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		int start=0;int end=s.length()-1;
		System.out.print(palindrome(s,start,end));
	}
	public static boolean palindrome(String s,int start,int end)
		{
		int i=0,j=s.length()-1;
		if(start<=end)
			return true;
		else
			return (s.charAt(start)==s.charAt(end))&&(palindrome(s,start+1,end-1));
		}
	}


