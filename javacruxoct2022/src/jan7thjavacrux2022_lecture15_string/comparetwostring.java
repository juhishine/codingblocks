package jan7thjavacrux2022_lecture15_string;

public class comparetwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="hello";
		if(s.length()==s1.length())
			{
			System.out.println("length is equal");
			for(int i =0;i<s.length();i++)
				{if(s.charAt(i)==s1.charAt(i))
					{
					continue;
					}
			   }
			System.out.println("strings are equal");
			}
			else
     System.out.println("string are not equal");
	}
}
