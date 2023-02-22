package javacruxoct2022_lecture1;

public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=2;
    int b=3;
    int c=5;
    int s=(a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("area of triangle"+ area);
	}

}
