package Dec3_javacrux2022_lecture9_Array1;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int arr[]=new int[n];
		int[] sr=new int[n];
		for(int i=0;i<sr.length;i++)
		{sr[i]=sc.nextInt();}
         Display(sr);
	}

	public static void Display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
