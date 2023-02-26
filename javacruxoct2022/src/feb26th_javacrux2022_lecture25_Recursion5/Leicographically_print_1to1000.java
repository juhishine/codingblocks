package feb26th_javacrux2022_lecture25_Recursion5;

public class Leicographically_print_1to1000 {
	/*
	 0    1 10 100 1000 101 102......... 109
	 11   110 111 112..................119
	 12   120 121 122...................129
	 ..
	 ...
	 19 190 191 .......................199
	 19 190 1900 
	 2 20 200 201 202....................209
	 9 99 999 9999
	 less than 1000
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		counting(0,n);
	}
	public static void counting(int curr,int end)
	{
		if(curr>end)
			{return;
			}
		System.out.println(curr);
		int i = 0;
		if(curr==0)
			{i=1;}
		for (; i <=9; i++) {
			counting(curr*10+i,end);
		}


	}

}
