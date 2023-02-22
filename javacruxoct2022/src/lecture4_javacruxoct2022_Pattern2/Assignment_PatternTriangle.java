package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* n=4
		 * same as pattern 28
            1               //1
		2	3	2             3/2
	3	4	5	4	3         5/2
4	5	6	7	6	5	4     7/2
		 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int star =1;
	     int val=0;
		for(int i=1;i<=n;i++)// 1 to 4
		{ 
			for(int j=n-1;j>=i;j--)//3 to 1, 2 to 1, 1 to 1
			 System.out.print("  ");
			int k=1;
			while(k<=star)  // 1<=1,3,5,7
			{  if(k<=star/2+1) //1<=2,2<=2
				{
				val++;}
			else
			{val--;}
			System.out.print(val+" ");
			k++;
			}
			star+=2;
			System.out.println();
		}		
		
	}

}
