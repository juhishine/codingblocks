package Assignment_31stjan_bitmasking_and_recursion;

public class Recursion_AsciiSubsequences {
	/*
	 Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences

Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printsubsequence(s,"");
        System.out.println();
        System.out.println(count);
             

    }
    public static void printsubsequence(String ques,String ans)
    {
        if(ques.length()==0)
        {    
            System.out.print(ans+" ");
            count++;
            return;
          }        
     char ch=ques.charAt(0);
     int chara=ques.charAt(0);
    // System.out.println(chara);
     printsubsequence(ques.substring(1),ans);
     printsubsequence(ques.substring(1),ans+ch);
       printsubsequence(ques.substring(1),ans+chara);

    }
    
}
