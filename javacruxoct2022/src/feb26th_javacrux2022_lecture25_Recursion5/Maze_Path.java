package feb26th_javacrux2022_lecture25_Recursion5;

public class Maze_Path {
	/*unique path in leet code*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
int m=3;
PrintPath(0,0,n-1,m-1,"");
	}
	//public static void PrintPath(int currrow,int currcol, int endrow,int endcol,String ans)
	public static void PrintPath(int cr,int cc, int er,int ec,String ans)
	{     
		if(cr==er&&cc==ec)
		{
			System.out.println(ans+" ");
		}
		if(cc>ec|| cr>er)
		{
			return;
		}
		PrintPath(cr,cc+1,er,ec,ans+"H" );
		PrintPath(cr+1,cc,er,ec,ans+"V" );

	}

}
