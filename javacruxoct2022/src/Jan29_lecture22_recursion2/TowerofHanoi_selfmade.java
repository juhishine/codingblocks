package Jan29_lecture22_recursion2;

public class TowerofHanoi_selfmade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n-3, call =15=> 1+2+2^2+2^3=2^4-1
		//n=3 ,call =7
		TOH(4,1,2,3);
	}
		public static void TOH(int n,int A,int B,int C)
		{
			if(n>0)
		{
			TOH(n-1,A,C,B);
			System.out.println(A+","+C);//its showing the steps
			TOH(n-1,B,A,C);
		}

	}

}
