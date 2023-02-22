package Dec3_javacrux2022_lecture9_Array1;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[5];// its non primitive data type , its in heap memory ,default value 0 will be set
//sabse pehele jvm aayega variable banega stack me, aur heap me memeory develop hoga
// location like 2000, 2004, 2008 , 2012...2020
//variable create in stack , location created in heap
System.out.println(a);
a[0]=90;
a[1]=-20;
a[2]=4;
a[3]=4;
a[4]=4;
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
//char [] arr1=new char[5];
//boolean [] ar=new boolean[5];
//System.out.println(ar[0]);
//System.out.println(arr1[0]);
//double [] arr11=new double[5];
//System.out.println(arr11[0]);
for(int i=0 ;i<a.length;i++)
{System.out.print(a[i]+" ");}

	}

}
