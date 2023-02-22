package javacruxoct2022_lecture2;

import java.util.Scanner;

public class Learning_breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=2;
		while(i<n)	// we run from 2 to n-1 , if we get any factor , then its not prime
		{ 
			if(n%i==0)
		    {
			fact++;
			break;// get out of while loop
		    }   
		 i++;
		
		}
		if(fact==1)// if we get one factor , then its not a prime no.
	
			System.out.println("not a prime number");
		else
			System.out.println("prime no");
			
		}


	}


