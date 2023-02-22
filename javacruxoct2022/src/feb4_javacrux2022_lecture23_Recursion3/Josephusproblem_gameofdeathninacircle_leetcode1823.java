package feb4_javacrux2022_lecture23_Recursion3;

public class Josephusproblem_gameofdeathninacircle_leetcode1823 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

		int n=40;int sword=7;
		int []arr = new int[n];

        for(int i=0;i<n;++i){
            arr[i] = i+1;
        }
        System.out.println(ans(arr,n,sword,(sword-1)%n));//(arr,40,7,6%40)
    }
     public static int ans(int []person, int n, int sword, int pos){
        if(n==1){
            return person[0];
        }
        for(int i=pos+1;i<n;++i){
            person[i-1] = person[i];
        }
        n--;//here we reduce lenth of array , because then only new value of position will be set
        return ans(person,n,sword,(pos+(sword-1))%n);
    }
}
/*
 n=5,k=2, op=3, we start from 1*/


