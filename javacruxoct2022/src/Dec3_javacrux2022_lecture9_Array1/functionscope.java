package Dec3_javacrux2022_lecture9_Array1;

public class functionscope {
	static int val=100;//global variable create in heap 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=9;
fun(8,5);
System.out.println(val); // global variable //heap changes get reflected 
}
	public static void fun(int x,int y)
	{
		x=x+9;
		System.out.println(x);
		System.out.println(val);
		int val=9;
		val=val+6;
		functionscope.val=functionscope.val+9; // if want to call global variable , then add class name +dot 
		System.out.println(val);
		System.out.println(functionscope.val);
	}	
}
