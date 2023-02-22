package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_PatternDoublesidedArrowstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
		 */
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=(n/2)*4;
		int star=1;
		int star2=1;
for(int row=0;row<n/2+1;row++)
{   
	for(int i=1;i<=space;i++)//12,8,4,0
     {System.out.print(" ");}
	for(int i=1;i<=star;i++)
		{System.out.print("* ");}
	int space2=(row<1)?0:row*4-2;//0.2.6.10
	for(int i=1;i<=space2;i++)
		System.out.print(" ");
	int i=1;
	if(row==0)
		i=2;
	for(;i<=star2;i++)
	System.out.print("* ");
	space=space-4;
	star=star+1;
	space2=space2+4;
	star2=star2+1;
System.out.println();
}
space=n/2+1;
star=n/2;
star2=n/2;
for(int row=n/2;row>0;row--)
{   
	for(int i=1;i<=space;i++)//12,8,4,0
     {System.out.print(" ");}
	for(int i=1;i<=star;i++)
		{System.out.print("* ");}
	int space2=(row==n/2)?row*2:row*2-2;
	for(int i=1;i<=space2;i++)
		System.out.print(" ");
	if(row==1)
		star2=0;
	for(int i=1;i<=star2;i++)
	System.out.print("* ");
	space=space+4;
	star=star-1;
	space2=space2-4;
	star2=star2-1;
System.out.println();
}

}
}
