package Jan_14th_javacrux2022_lecture17_ArrayList1;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array list me generic primitive are not allowed , thats y learning wrapper class
		//string is not a wrapper class
		Integer a=10;//allocate in some location 2k in heap 
		int a1=10;
		//a=a1;//autoboxing
		//primitive data ko wrap kar ke non primitive 
		//stack memory ko transfer kar rahe hai heap me 
		//int b=a;//unboxing ,a ke paas hamesha address hoga//b me 89 ayega 
		System.out.println(a);
		System.out.println(a1);
		int i=189;
		Integer ii=i;//autoBoxing //heap to utha kar stack me dal dete hai //converted primitive to non primitive
//time complexity cost more 
		System.out.println(ii);
		System.out.println(i);
		Long l=1889L;
		long ll=l;//unBoxing 
		Integer x=19;
		Integer x1=19;
		Integer y=781;
		Integer y1=781;
		System.out.println(x==x1);//true // if value between -128 to 127 then only true else false 
		System.out.println(y==y1);//false
		//applicable only for (integer,long ,char,short) not for other primitive
		Character ch='�';
		Character ch1='�';
		Character ch2='a';
		Character ch3='a';
		char c=(char)(234);
		System.out.println(c);
				System.out.println(ch==ch1);
				System.out.println(ch2==ch3);

	}

}
