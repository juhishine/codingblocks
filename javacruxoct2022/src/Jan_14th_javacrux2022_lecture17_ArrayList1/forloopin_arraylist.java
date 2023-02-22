package Jan_14th_javacrux2022_lecture17_ArrayList1;

import java.util.ArrayList;

public class forloopin_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();//list ka size 0 tha

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);//autoboxing 
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
for(int val:list)//unboxing
{
	System.out.print(val+" ");
	}
	}

}
