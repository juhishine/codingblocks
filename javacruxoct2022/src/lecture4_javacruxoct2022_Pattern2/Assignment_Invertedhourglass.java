package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_Invertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* n=5
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 //3 spaces,7,11,15,19// 1+1+1,1+3+3,1+5+5,1+7+7
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val;
		for(int i=0;i<n;i++)
		{int v=n;
		for(int j=0;j<=i;j++)
			{System.out.print(v+" ");
		    v--;}//18,14,10,6,2
		for(int k=1;k<=2*(n-i)-1;k++)//2*(5-0)-1
		{   System.out.print(" ");}
		for(int l=1;l<=2*(n-i)-1;l++)
		{	System.out.print(" ");}
		val=n-i;
		for(int m=0;m<=i;m++)
		{
		System.out.print(val+" ");
		val++;
		}
		
		System.out.println();
		}
		for(int i=0;i<=n;i++)
		{int v=n;
		for(int j=n;j>=i;j--)
			{System.out.print(v+" ");
		    v--;}//18,14,10,6,2
		int countspaces1=(i>0)?2*i+1:i;
		for(int k=2;k<countspaces1;k++)
		{   System.out.print(" ");}//2,6,10,14 //0,1,2,3//1,3,5,7
		for(int l=2;l<countspaces1;l++)//2*(n-i)-1 2*5-1
		{	//if(l>0)
			System.out.print(" ");}
		val=i+1;
		int f=val;
		f--;//1,2,3,4,5
		int countnumber=i;
		if(i>0)
			countnumber--;
		for(int m=n;m>countnumber;m--)
		{if(i>0)
			{System.out.print(f+" ");f++;}
		else
		{System.out.print(val+" ");
		val++;}
		}
		System.out.println();
		}
		/*for(int i=1;i<=n;i++)
		{int v=n,r=n-i+1; 
		for(int j=0;j<i;j++)
		{
			System.out.print(v+" ");
		}
		v--;
		}
		for(int z=0;z<(n-i)*2+1;z++)
		{System.out.print("  ");
		}
		for(int j=0;j<i;j++)
		{if(r==0)
		{r++;
		}
		else
		{System.out.print(r+" ");
		r++;
		}
		}
		System.out.println(); 
		for(int i=n;i>=1;i--)
		{int v=n,r=n-i+1; 
		for(int j=0;j<i;j++)
		{System.out.print(v+" ");
		v--;
		}
		for(int z=0;z<(n-i)*2+1;z++)
		{System.out.print("  ");
		}
		for(int j=0;j<i;j++)
		{if(r==0)
		{r++;
		}
		else
		{System.out.print(r+" ");
		r++;
		}
		}
		System.out.println();
		}*/
		}
		}
