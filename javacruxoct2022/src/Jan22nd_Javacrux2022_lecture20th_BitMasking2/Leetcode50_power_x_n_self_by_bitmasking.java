package Jan22nd_Javacrux2022_lecture20th_BitMasking2;

public class Leetcode50_power_x_n_self_by_bitmasking {
	/*https://leetcode.com/problems/powx-n/solutions/1337794/java-c-simple-o-log-n-easy-faster-than-100-explained/
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int n=2;
		if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){  //10&1
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        System.out.println(pow);
	}
	}