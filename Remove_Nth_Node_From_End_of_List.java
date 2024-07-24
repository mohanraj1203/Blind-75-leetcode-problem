import java.util.*;
class Remove_Nth_Node_From_End_of_List{
	static int index=-1;
	static Node buildLinkedList(int[] arr){
		index++;
		if(index == arr.length)
			return null;
		
		Node newNode=new Node(arr[index]);
		newNode.next=buildLinkedList(arr);
		
		return newNode;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		Node head=buildLinkedList(arr);
		
		int k=obj.nextInt();
		
		Node temp=head;
		int size=0;
		while(temp!=null){
			size++;
			temp=temp.next;
		}
		size-=k;
		temp=head;
		if(size == 0)
			head=head.next;
		else{
			for(int i=0;i<size-1;i++)
				temp=temp.next;
			temp.next=temp.next.next;
		}
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}