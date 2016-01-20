import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
public class linkedlist {

	public static  Node insert(Node head, int data)
	{
  	//Complete this method
		Node pointer = head;
			if(pointer == null){
				//System.out.println("head is null");
				Node n = new Node(data);
				n.next = null;
				head = n;
				return head;
			}
			else{
				//System.out.println("Head is not null");
				while(pointer.next != null)
				{
					pointer= pointer.next;
				}
				Node n = new Node(data);
				n.next = null;
				pointer.next = n;
				return head;
			}
			
		
	}
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head, ele);
          }
          display(head);

   }
}
