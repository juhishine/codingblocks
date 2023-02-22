package jan7thjavacrux2022_lecture15_string;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr= {1,2};//array is non primitive
//int[] arr1= {1,2};
//System.out.println(arr1==arr);//ye address compare kar raha hai 
//System.out.println(arr1.equals(arr));
		String s="hello";// its in string pool/internal pool// isii me pool me concatenate hoga... baaki saara outside pool se banega 
		//s=s+"bye";// it made outside pool //internally new work karte hai //input lete hai , usme bhi internally new work karta hai 
		//string is immutable ...not change 
		String s1=new String("hello");
		s1=s1+"bye";
		System.out.println(s1);
		String s2="hello"+"bye";//yehi ek tarika hai , ki ye string pool me banega ,literal utha ke add kar diya 
		String s3="hello"+"bye";
		s2=s2+"okay";//hello bye bahaar heap me aajeyaga 
		System.out.println(s2==s3);//li
		System.out.println(s2);
	}

}
