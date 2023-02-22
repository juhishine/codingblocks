package feb4_javacrux2022_lecture23_Recursion3;

public class heightofbinarytree_or_maxdepthofbinarytree_leetcode105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leetcode question 105ques_done
		TreeNode root=5;
		System.out.println(maxDepth(root));
	}
		 public int maxDepth(TreeNode root) {
		       if(root==null) return 0 ;
		        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
		    }
		}