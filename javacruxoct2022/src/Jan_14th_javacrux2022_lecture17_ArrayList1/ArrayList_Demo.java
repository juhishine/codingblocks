package Jan_14th_javacrux2022_lecture17_ArrayList1;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array , string are non primitive data type
		//array is static in nature 
		//arraylist is dynamic in nature 
		ArrayList<Integer> list=new ArrayList<>();//list ka size 0 tha
		//angular bracket says its written in generic form 
		//capacity is 10
		//ArrayList<Integer> list=new ArrayList<>(50);// aisse capacity 50 ho jayegi
		//ArrayList<int>//not allowed , use only wrapper class
		list.add(1);//autoboxing ,primitive ko non primitive me add kar rahe hai
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.size());
		//capacity grow by 1.5 by size -size=10,capacity =15
		System.out.println(list.get(1));
		list.add(3,-9);//-9 to enter at 2nd position
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		list.set(1,-11);// update karega ye new value like -11 at -9
		System.out.println(list);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list.size());
		list.add(13);
		System.out.println(list.size());

		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		

		
	}

}
