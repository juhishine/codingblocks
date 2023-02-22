package Assignment27thnov_function;

import java.util.Scanner;

public class Shopping_game {

		public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int t =sc.nextInt();
	        while(t-->0){
	            int ayush_max = sc.nextInt();
	            int harshit_max = sc.nextInt();
	            int ayush_count=0;
	            int harshit_count=0;
	            for(int i = 1;;i++){
	                if(i%2==0){
	                    if(harshit_count +i <= harshit_max){
	                        harshit_count = harshit_count+i;
	                    }
	                    else{
	                        System.out.println("Aayush");
	                        break;
	                    }
	                }
	                else{
	                    if(ayush_count +i <= ayush_max){
	                        ayush_count = ayush_count+i;
	                    }
	                    else{
	                        System.out.println("Harshit");
	                        break;
	                    }
	                }
	            }
	}
	    }
	}