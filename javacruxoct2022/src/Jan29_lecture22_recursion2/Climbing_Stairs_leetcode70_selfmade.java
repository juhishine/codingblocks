package Jan29_lecture22_recursion2;

public class Climbing_Stairs_leetcode70_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(climbingStairs(n));
	}
	public static int climbingStairs(int n){
		 if(n == 1 || n == 0) return 1;
	        
	        int a = 0; int b = 1; int c = 0;
	        
	        for(int i = 1 ; i <= n ; i ++){
	            c = a + b;
	            a = b ; 
	            b = c;
	        }
	        return c;
	        /*
	         if(n==1) return 1;
        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
        */
	        /*
	          if (n==1) 
                 return 1;
             if (n ==2) 
                 return 2;
             return climb(n-1) + climb(n-2);
             */
	    }
	}