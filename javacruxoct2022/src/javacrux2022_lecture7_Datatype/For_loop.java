package javacrux2022_lecture7_Datatype;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(byte b=0;b<128;b++)// b=(byte)(b+1), it will impicitly typecast, range is -128 to 127
//{
	//System.out.println(b);// it will run infinite loop , it 127 , -128 
//}
		for(byte b=0;b<=127;b++)
			System.out.println(b);// infinite loop , after 127 it will type cast next to -128
	}

}
