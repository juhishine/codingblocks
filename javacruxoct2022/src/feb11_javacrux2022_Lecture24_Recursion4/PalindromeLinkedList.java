package feb11_javacrux2022_Lecture24_Recursion4;

import java.util.LinkedList;

public class PalindromeLinkedList
{

	public class LinkedList {
		int val;
		LinkedList next;
		LinkedList() {}
		LinkedList(int val) { this.val = val; }
		LinkedList(int val, LinkedList next) { this.val = val; this.next = next; }

	}
	public static void addlast(int val)
	{LinkedList newnode=new LinkedList(val);
	LinkedList head;
	if(head==null)
	{
		head=newnode;
	return;
	}
	LinkedList currNode=head;
	while(currNode.next!=null)
	{ currNode=currNode.next;
	}
	currNode.next=newnode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList ll = new LinkedList(); 
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		boolean f=reverse(list.getFirst());
		System.out.println(f);
		//ll.printList();	
	}
	public boolean isPalindrome(LinkedList head) {
		if(head==null)
			return true;
		LinkedList mid=middle(head);
		LinkedList last=reverse(mid.next);
		LinkedList cur=head;
		while(last!=null)
		{
			if(last.val!=cur.val)
				return false;
			last =last.next;
			cur=cur.next;
		}
		return true;
	}
	public static LinkedList middle(LinkedList head)
	{
		LinkedList slow=head;
		LinkedList fast=head;
		while(fast!=null&& fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	/*public static LinkedList reverse(LinkedList curr)
	    {  
	        //LinkedList curr=head;
	         LinkedList temp;
	        LinkedList prev=null;
	        while(curr!=null)
	        {
	            temp=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=temp;
	        }
	        return prev;
	    }*/
	public static LinkedList reverse(LinkedList head)
	{
		if(head==null || head.next==null)
		{return head;
		}
		LinkedList newhead=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return newhead;
	}
}
