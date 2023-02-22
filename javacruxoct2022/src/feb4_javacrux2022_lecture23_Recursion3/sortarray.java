package feb4_javacrux2022_lecture23_Recursion3;

import java.util.*;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] array=new Integer[] {3,7,4,9};
ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(array));

sort(arr);
System.out.println(arr);
	}
	public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
		if(arr.size()==0)
			{return arr;
			}
		int temp=arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		arr=sort(arr);
		arr=insert(arr,temp);
		return arr;
		
			}
	public static ArrayList<Integer> insert(ArrayList<Integer> arr,int temp)
	{
		if(arr.size()==0)
			{arr.add(temp);
		return arr;}
		else if(arr.get(0)>=temp)
		{
			arr.add(0,temp);
			return arr;
		}
		else if(arr.get(arr.size()-1)<=temp)
		{
			arr.add(arr.size(),temp);
			return arr;
		}
		int temp1=arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		insert(arr,temp);
		arr.add(arr.size(),temp1);
		return arr;
	}
	}



