package Selfmadenotes_1_7thnov;

import java.util.Scanner;

public class Methods_Area_with_without_args_returnvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operationno, length ,width;
		double a_circle;
		System.out.println("Perform folllowing operation /n 1.Area of Square/n 2.Area of Circle/n"
				+ " 3.Area of rectangle /n");
		Scanner sc=new Scanner(System.in);

		operationno=sc.nextInt();
		switch(operationno) { // Java is case sensitive , so lowercase s
		
			case 1:
				{areaofsquare();
				
				
				break;
				}
				
			case 2:
				{a_circle=areaofcircle();
				System.out.println(a_circle);
				
                break;
				}
				
			case 3:
				{length=sc.nextInt();
				width=sc.nextInt();
				double a_rectangle =areaofrectangle(length,width);
				System.out.println(a_rectangle);
				
				break;
				}
				
			default:
				System.out.println("Invalid Operation no.");
		}
		

	}
	
	public static void areaofsquare()
	{
		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		System.out.println(side*side);
	}
	public static double areaofcircle()
	{    
		Scanner sc=new Scanner(System.in);
	     int radius=sc.nextInt();
	     return 3.14*radius*radius;
	}
	public static double areaofrectangle(int l,int b)
	{
		return l*b;
	}

}
