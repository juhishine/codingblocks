package Jan21st_Lectur19th_BitMasking;

public class Singlenumber_Unique_number_leetcode_136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,2,1};
		System.out.println(Unique_number(num));
	}
	public static int Unique_number(int[] num){
		int result=0;
		for (int i = 0; i < num.length; i++) {
			result=result^num[i];
			
		}
    return result;
	}

}
