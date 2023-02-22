package Jan28th_Lecture21_Recursion;

public class Array_1st_occr {
	//tail recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,2,5,7};
		int item=4;
		System.out.println(Index(arr,item,0));

	}
	public static int Index(int[] arr,int item,int i)
	{   if(i==arr.length)
	    {
		return -1;// if not found number
	    }
		if(arr[i]==item)
			return i;// where item match number in array
		
			return Index(arr,item,i+1); 
			//i=0=>index(arr,item,1)
			//i=1=>index(arr,item,2)
			//i=5=>index(arr,item,6)
	}

}
//IBH ,easy
//i/p-o/p , med
//choice dp by aditya verma youtube