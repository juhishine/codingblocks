package javacruxoct2022_lecture1;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=76;
		if (marks>=70)
			System.out.println("Grade A");
		else if(marks>=60 && marks<70)
		System.out.println("Grade B");
		else if (marks>=50 && marks <60)
			System.out.println("Grade C");
		else if(marks>=40&& marks <30)
			System.out.println("Grade D");
		else 
			System.out.println("Fail");

	}

}
