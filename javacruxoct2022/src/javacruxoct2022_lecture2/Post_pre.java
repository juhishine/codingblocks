package javacruxoct2022_lecture2;

public class Post_pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5;
     int c=0;
     System.out.println(a++);
     System.out.println(a);
     c=a++ +a-- +8 -a-- -a++;
     System.out.println(c);
     a=16;
     int d=0;
     d=a++ +a-- +8 +a-- -a++ -a++;
     System.out.println(d);
     System.out.println(++d);
     System.out.println(d);
     int e=0; 
     a=15;
     e= ++a - --a + ++a -a-- + a++ +--a;
     System.out.println(e);
	}

}
