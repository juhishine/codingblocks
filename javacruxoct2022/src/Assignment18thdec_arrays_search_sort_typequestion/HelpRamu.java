package Assignment18thdec_arrays_search_sort_typequestion;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc=new Scanner(System.in);

		        int t= sc.nextInt();

		        while(t-->0){

		            int c1=sc.nextInt();
		            int c2=sc.nextInt();
		            int c3=sc.nextInt();
		            int c4=sc.nextInt();

		            int n= sc.nextInt();
		            int m= sc.nextInt();

		            int [] rick=new int[n];

		            for(int i=0;i<n;i++){

		                rick[i]= sc.nextInt();
		            }


		            int[] cab=new int[m];

		            for (int i=0;i<m;i++){

		                cab[i]= sc.nextInt();
		            }


		            System.out.println(minCost(c1,c2,c3,c4,rick,cab));



		        }

		    }

		    public static int  minCost(int c1, int c2, int c3, int c4, int[] rick, int[] cab){

		        int rickcost=0;
		        int cabcost=0;
		        int sum=0;
		        int rickcost1=0;
		        int cabcost1=0;

		        for(int i=0;i<rick.length;i++){

		            rickcost+= Math.min(rick[i]*c1,c2);

		        }

		        rickcost1=Math.min(rickcost,c3);

		        for(int i=0;i<cab.length;i++){

		            cabcost+= Math.min(cab[i]*c1,c2);

		        }

		        cabcost1=Math.min(cabcost,c3);


		        sum=Math.min(rickcost1+cabcost1,c4);

		        return sum;






		    }
		}