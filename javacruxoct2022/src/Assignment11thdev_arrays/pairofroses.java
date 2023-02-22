package Assignment11thdev_arrays;

public class pairofroses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        /* 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// number of test Cases
		while (t-- > 0)
		{
			int n = sc.nextInt();// number of roses
			int[] price = new int[n];
			for (int i = 0; i < price.length; i++)
			{
				price[i] = sc.nextInt();
			}
			int m = sc.nextInt();// total money Deepak has
			Pair_of_roses(price, m);
			System.out.println();
		}
	}

	public static void Pair_of_roses(int[] price, int m)

	{
		int p1 = 0;
		int p2 = 0;
		int small, big;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < price.length-1; i++)
		{
			for (int j = i + 1; j < price.length; j++)
			{
				if (price[i] + price[j] == m)
				{
					if (price[i] > price[j])
					{
						small = price[j];
						big = price[i];
					} else
					{
						small = price[i];
						big = price[j];
					}
					if (diff >= big - small)
					{
						p1 = small;
						p2 = big;
						diff = big - small;
					}
				}
			}
		}
		 System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
	}

}*/
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=1;i<=t;i++)
{
    int n=sc.nextInt();
    //System.out.println(n);
    int arr[]=new int[n];
    for(int j=0;j<arr.length;j++)
    {
        arr[j]=sc.nextInt();
    }
    int c=sc.nextInt();
    System.out.println();
    int min= 1000001;
    int g=0,h=0;
  for(int k=0;k<arr.length-1;k++)
  {
      for(int m=0;m<arr.length;m++)
      {
          if(arr[k]+arr[m]==c)
          {
              int e=arr[k];
              int f=arr[m];
                if(Math.abs(e-f)<min)
                {
                    min=(e-f);
                }
                 g=e;
                 h=f;

          }
      }
  }
          
          System.out.print ("Deepak should buy roses whose prices are " );
           System.out.print (g);
           System.out.print (" and ");
           System.out.print (h);
           System.out.print (".");

          
           
           
      
  
}


}

}
