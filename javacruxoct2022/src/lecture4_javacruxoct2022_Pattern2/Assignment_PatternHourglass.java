package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_PatternHourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* n=5
                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5

 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val;
		int countspace=0;
		for(int i=n;i>=0;i--)
		{ 
		  for(int j=0;j<countspace;j++)
		  {System.out.print("  ");
		  }
		  countspace++;
		  val=i;
		  int v=1;
		  for(int k=1;k<=i;k++)
		  { System.out.print(val+" "); 
			val--; 
		  }
		    System.out.print("0 ");
		    for(int l=1;l<=i;l++)
		    {
		    System.out.print(v+" ");
			v++;
			}
			System.out.println();
			
		}
			for(int m=0;m<n;m++)
			{ 
			  for(int q=n-1;q>m;q--)
			  {System.out.print("  ");
			  }
              int c=1;
			  for(int k=0;k<=m;k++)
			  { System.out.print(c+" "); 
				c++; 
			  }
			    System.out.print("0 ");
			    int u=1;
			    for(int l=0;l<=m;l++)
			    {
			    System.out.print(u+" ");
				u++;
				}
				System.out.println();
		     }

	}

}
