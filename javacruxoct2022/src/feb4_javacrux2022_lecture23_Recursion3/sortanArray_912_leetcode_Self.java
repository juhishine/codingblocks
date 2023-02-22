package feb4_javacrux2022_lecture23_Recursion3;
import java.util.*;

public class sortanArray_912_leetcode_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pehele hypothesis banayenge
		/*base condition then hypothesis then induction
		sort function lagega kisi array 
		*/	
//ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,2,3,1));
//Integer[] array = { 29, 28, 27, 16, 15, -14, 3, -2, 2};
Integer[] array = { 9, 8, 7, 6, 15, -4, 3, -2, 2};

ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));   
sort(arr);
	        System.out.println(arr);  
	    }
	
	public static ArrayList<Integer> sort(ArrayList<Integer> arr){
		 if(arr.size()==0){
	           return arr;
	        }
	        int temp =arr.get(arr.size()-1);//last element store in temp
	        arr.remove(arr.size()-1);//remove kar diya last element 
	        sort(arr);//ab sort function lagenyege baki arraylist me 
	        insert(arr,temp);
	        return arr;
	    }
    public static ArrayList<Integer> insert(ArrayList<Integer> list,int temp){
        if(list.size()==0||list.get(list.size()-1)<=temp ){//|| (int)arr.get(arr.size()-1)temp){
            list.add(temp);//empty me temp dala 
            return list ;
        }
//        else if(list.get(0)>=temp){
//            list.add(0,temp);//pos 0 me temp dala 
//            return list;
//        }
//        else if(list.get(list.size()-1)<=temp){
//            list.add(list.size(),temp);//end pos me temp dala 
//            return list;
//        }
        int temp1 =(list.get(list.size()-1));//takeout last element
        list.remove(list.size()-1);//chota kiya array list
        insert(list,temp);//temp ko sahi position me dala
        list.add(list.size(),temp1);
        return list;
    }
    
}

		//hypothesis
		//induction (kaam karayenge)
		/*
		  sort(1,5,0,2)
		  sort(1,5,0,2)=>0,1,2,5=> 2 ko sahi jagah me place 
		  sort(1,5,0)*/
	
