package jan7thjavacrux2022_lecture15_string;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";//literal , hard code value// made in pool//2k location
String s1=new String("hello");//send as function, in heap value will be stored with location 2k //made in heap
//non primitve data stored in heap
String s2="hello";//3k
String s3=new String("hello");//5k
String s4=s3;//address will come
System.out.println(s1);
//string is class
System.out.println(s==s1);//false
System.out.println(s2==s);//true
System.out.println(s3==s1);//false
//heap ke andar content duplicate nhi hota
System.out.println(s.charAt(2));
System.out.println(s1.length());//string is function
//ar.length is a property , class ka data member
System.out.println(equals(s,s2));
System.out.println(equals(s,s1));
System.out.println(s.equals(s1));//java wala
	}
	public static boolean equals(String s1,String s2)
	{
		if(s1==s2)
		{return true;}
		if(s1.length()!=s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
		}return true;
	}

}
