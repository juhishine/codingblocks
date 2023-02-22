package javacruxoct2022_lecture2;

public class Sumofn_naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=1; 
    int n=10;
    int sum=0;
    while(i<=n)
    {   sum=sum+i;
    	i=i+1;
    }
    System.out.println("sum of n natural number"+ sum);
	}

}
