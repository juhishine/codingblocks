package Jan21st_Lectur19th_BitMasking;

public class Masking_tosolvethequestion {
	/*
	 to set the values 
	 */
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=64;
		 int i=4;
		 if(Isset(n,i)) {System.out.println("value is set");}
		 else
			 System.out.println("value is not set");
		 
	}
	public static boolean Isset(int n,int i)
	{
		 int mask=i<<4;
		 if((n&mask)!=0)
				 {return true;}
		 else
			 return false;

	}

}
