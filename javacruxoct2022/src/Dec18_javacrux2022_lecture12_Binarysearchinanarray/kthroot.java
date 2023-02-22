package Dec18_javacrux2022_lecture12_Binarysearchinanarray;
import java.util.*;

public class kthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();           //87
int k=sc.nextInt();int max=0;   //3
for(int i=1;i<=Integer.MAX_VALUE;i++)
	{if(Math.pow(i, k)>n)
		{
        max=i;
         break;
        }
	}
System.out.println(max-1);// 4^3<=87
	}

}
