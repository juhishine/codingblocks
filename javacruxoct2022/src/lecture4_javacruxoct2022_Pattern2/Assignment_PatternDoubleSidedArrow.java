package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_PatternDoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
                            1 //row=0, space=0 2*i
                        2 1   1 2// row =1, space=2 2*i
                    3 2 1       1 2 3 // row=2, space=6  2*i+2
                4 3 2 1           1 2 3 4 //row=3, space=10 2*i+4 
                    3 2 1       1 2 3      //row=5, n/2=3
                        2 1   1 2 
                            1 

		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=(n/2)*4;
		int star=1;
		int star2=1;
for(int row=0;row<n/2+1;row++)
{   int val=star;
	for(int i=1;i<=space;i++)//12,8,4,0
     {System.out.print(" ");}
	for(int i=1;i<=star;i++)
		{System.out.print(val+" " );
		val--;}
	int space2=(row<1)?0:row*4-2;//0.2.6.10
	for(int i=1;i<=space2;i++)
		System.out.print(" ");
	int i=1;
	if(row==0)
		i=2;
	int value=1;
	for(;i<=star2;i++)
	{System.out.print(value+" ");
	value++;}
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
	int val=row;
	for(int i=1;i<=star;i++)
		{System.out.print(val+" ");
		val--;}
	int space2=(row==n/2)?row*2:row*2-2;
	for(int i=1;i<=space2;i++)
		System.out.print(" ");
	if(row==1)
		star2=0;
	int value=1;
	for(int i=1;i<=star2;i++)
	{System.out.print(value+" ");value++;}
	space=space+4;
	star=star-1;
	space2=space2-4;
	star2=star2-1;
System.out.println();
}

}
}

		/*
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int space =n-1;
int space2=0;
int row=1;
int star=1;
int val=1;
int star2=1;
     while(row<=n)//1<=7
      {int i=1;
       int v=row;
       while(i<=space)
       { 
    	 System.out.print(" ");
         i++;
        }          
         int j=1;
         if(row==n||row==1)
          j=2;
          while(j<=star)
          {
          System.out.print(v+" ");
           j++;
           if(row<=n/2+1)
           v--;
           }
          int l=1;

          while(l<=space2)
          {System.out.print(" ");
            l++;
           } 
       int k=1;
       while(k<=star2)
          {System.out.print(k+" ");
           k++;
           }
       
     if(row<=n/2)
     {star++;
      star2++;
      space-=2;
      space2+=2;}
     else
	{star--;
	star2--;
	space+=2;
	space2=space2-2;}
row++;
System.out.println();
}
	}
	}
*/


/*int m;
int space=n+8;
int space2=-2;
for(int j=1;j<=n;j++)
{for(int k=1;k<=space;k++)
	System.out.print(" ");
int posval=(j>n/2)?n-j+1:j;

int numbercount=(j>n/2+1)?n-j+1:j;//1>4,7-1+1,3,5,//2,6,10
int numbercount1=(j>n/2)?n-j+1:j;

for(int i =1;i<=numbercount;i++)
{System.out.print(posval+" ");
posval--;
}
for(int l=0;l<space2;l++)//1<-2,0<2,0<6
{System.out.print(" ");
}
int val=1;
int n1= numbercount1;
if(j == 1 || j == n) {
	n1--;
}
for( m =1;m<=n1;m++)
{
	//if(m==n||m==1)
	//{System.out.print("");}
	//else
    //{
    System.out.print(val+" ");
    val++;

    //}

}
if(j>n/2)
	{space=space+4;
    space2=space2-4;
    }
else 
	{space=space-4;
    space2=space2+4;//2,6,10 space
    }
System.out.println();
}
*/


