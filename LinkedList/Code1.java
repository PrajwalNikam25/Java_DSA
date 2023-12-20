

class Node{

	int data;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class LL{

	Node head = null;

	void addNode(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;	
		}else{
		
			Node temp = head;

			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();

		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(40);
	}
}
