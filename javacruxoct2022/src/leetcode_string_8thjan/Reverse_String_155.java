package leetcode_string_8thjan;

public class Reverse_String_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi ju";
String[] arr=s.split(" ");
int i=0;int j=arr.length-1;
String temp;
while(i<j)
{temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
	}
for (int k = 0; k < arr.length; k++) {
	System.out.print(arr[k]);

}
	}

}
