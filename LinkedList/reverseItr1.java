

class Node{

	int data;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}

class LL{

	Node head = null;


	// Add Node:
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

	// Link List Print:
	void print(){
	
		Node temp = head;

		if(head == null){
		
			System.out.println("List is Empty");
		}else{
		
			while(temp.next != null){
			
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	// Linked List Reverse:
	void revItr(){
	
		Node curr = head;
		Node forward = null;
		Node prev = null;

		while(curr != null){
		
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}

	// Linked List Recurtion:
	void revRec(Node prev,Node curr){
	
		if(curr == null){
		
			head = prev;
			return;
		}else{
			
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		revRec(prev,curr);
	}

	// Count Node:
	int countNode(){
	
		Node temp = head;
		int count = 0;

		while(temp != null){
		
			temp = temp.next;
			count ++;
		}
		return count;
	}

	// Find The Middle Node :
	void Midd1(){
	
		Node temp = head;
		int count = 0;

		while(count < countNode()/2){
		
			temp = temp.next;
			count++;
		}
		System.out.println(temp.data);
	}

	// Find Mid Node:
	void Midd2(){
	
		Node slow = head;
		Node fast = head.next;

		while(fast != null){
		
			fast = fast.next;
			
			if(fast != null){
			
				fast = fast.next;
			}
			slow = slow.next;
		}
		System.out.println(slow.data);
	}
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();

		Node prev = null;

		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(40);
		//obj.revRec(prev,obj.head);

		obj.print();
		obj.Midd2();
	
	}
}
