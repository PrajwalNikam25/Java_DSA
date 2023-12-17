

class Node{

	int data;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class LL{

	Node head = null;

	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;

			head = newNode;
		}
	}

	void printLL(){

		if(head == null){
		
			System.out.println("Empty List");
		}

		Node temp = head;

		while(temp != null){
		
			System.out.println(temp.data);

			temp = temp.next;
		}
	}
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();

		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);

		obj.printLL();
	}
}
