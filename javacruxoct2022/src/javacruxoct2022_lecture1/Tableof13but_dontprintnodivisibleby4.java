package javacruxoct2022_lecture1;

public class Tableof13but_dontprintnodivisibleby4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		for(int i=1;i<=10;i++)
		{ n=i*13;
		if(n%4!=0)
			System.out.println(n);
		}

	}

}
