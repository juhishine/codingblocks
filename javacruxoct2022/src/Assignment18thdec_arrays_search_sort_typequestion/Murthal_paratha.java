package Assignment18thdec_arrays_search_sort_typequestion;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_paratha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
The coding blocks members went to the success party of their first ever online boot-camp at Murthal. They 
ordered P number of paranthas. The stall has L cooks and each cook has a rank R. A cook with a rank R can 
cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 1 more parantha in 3R minutes 
and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. he will cook one 
parantha in 2 minutes one more parantha in the next 4 mins and one more in the next 6 minutes hence in total 
12 minutes he cooks 3 paranthas. In 13 minutes also he can cook only 3 paranthas as he does not have enough 
time for the 4th parantha). Calculate the minimum time needed to cook all the paranthas.

Input Format
First line contains P, the number of pratha ordered. In the next line the first integer denotes the number of 
cooks L and L integers follow in the Next line each denoting the rank of a cook.

Constraints
P <= 1000
L <= 50
1 <= R <= 8

Output Format
Print an integer which tells the number of minutes needed to get the order done.

Sample Input
10
4 
1 2 3 4
Sample Output
12
Explanation
First cook with rank 1 cooks 4 paranthas in 10 minutes (1+2+3+4).
Second cook with rank 2 cooks 3 paranthas in 12 minutes (2+4+6)
Third cook with rank 3 cooks 2 paranthas in 9 minutes (3+6) Fourth cook with rank 4 only needs to cook one 
last remaining parantha. He can do that in 4 minutes.
Since these cooks cook parallely, the total time taken will be the maximum of the four i.e. 12 minutes.
 */
		
		       Scanner sc = new Scanner(System.in);
				int P=sc.nextInt();//no. of paratha
		         int L = sc.nextInt();//no.of cooks (rank of cook)
				  long[] Rank=new long[L];
				  for(int i =0;i<L;i++) {
					   Rank[i]=sc.nextLong();
		          }
		          Arrays.sort(Rank);
		          System.out.println(maxtimetocook(Rank, P, L)+" ");
				  
				}

				public static long maxtimetocook(long Rank[], int P, int L) {
				long ans = 0, low = 0,high=0;
		        high=P*(P+1)*Rank[Rank.length-1]/2;
				  while (low < high) {
				  	long mid =low+ (high - low) / 2;
				  	if (isValid(Rank, P, L, mid)==true) {
				  		ans = mid;
				  		high = mid - 1;
				  	} else {
				  		low = mid + 1;
				  	}
				  }
				  return ans;
				}

				public static boolean isValid(long R[], int P, int L, long mid) {
				int paratha = 0;
				long time= 0;
				for (int i = 0; i < L; i++) {
		            if(R[i]<1||R[i]>8||L>50)
		            {
		                return false;
		            }
					time=R[i];//time=1
					int j=2;
				  	while(time<=mid) { // 1<=
				  		 paratha++;
				        time += R[i]*j;
		                j++;  		
				  	} 
				    if(paratha>=P && P<=1000 && L<=50)
		              return true;
		              
				}
				  return false;
				}
		}