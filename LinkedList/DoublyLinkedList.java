

class Node{

	int data;

	Node prev = null;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class DLL{

	Node head = null;

	// Add First:
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;

			newNode.prev = null;

			head = newNode;
		}
	}

	// Print Doubly Linked List:
	void print(){
	
		if(head == null){
		
			System.out.println("Empty List");
		}else{
		
			Node temp = head;

			while(temp != null){
			
				System.out.println(temp.data);

				temp = temp.next;
			}
		}
	}

	// Add Last:
	void addLast(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			addFirst(data);
		}else{
		
			Node temp = head;

			while(temp.next != null){
			
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
	}

	// Add At Position:
	void atPosition(int pos,int data){
	
		Node newNode = new Node(data);

		if(pos == 1){
		
			addFirst(data);
		}else if(pos == countNode()+1){
		
			addLast(data);
		}else{
		
			Node temp = head;

			while(pos-2 == 0){
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;

		}
	}

	//Count:
	int countNode(){
	
		Node temp = head;

		int count = 0;

		while(temp != null){
		
			count++;
			temp = temp.next;
		}
		return count;

	}
	
	//detFirst:
	void detFirst(){
	
		if(head == null){
		
			System.out.println("Empty");
			return;
		}else{
		
			head = head.next;

			head.prev = null;
		}
	}

	//detLast:
	void detLast(){
	
		if(head == null){
		
			System.out.println("Is Empty");
		}else{
	
			Node temp = head;
			
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.prev.next = null;
		}
	}

	// detAtPosition:
	void detAtPosition(int pos){
	
		if(pos <= 0 || pos >= countNode()+1){
		
			System.out.println("Invalid Input");

		}else if(pos == 1){
			
			detFirst();
		}else if(pos == countNode()){
		
			detLast();
		}else{
		
			Node temp = head;

			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}

	// Sum Of Node:
	int sum(){
	
		Node temp = head;
		int sum = 0;

		while(temp != null){
		
			sum = sum + temp.data;
			temp = temp.next;
		}
		return sum;
	}

}
class Client{

	public static void main(String[] a){
	
		DLL obj = new DLL();

		obj.addFirst(30);
		obj.addFirst(20);
		obj.addFirst(10);
		obj.addLast(40);
		obj.atPosition(2,333);
		
		obj.print();

		System.out.println("------------------------");

		obj.detAtPosition(5);

		obj.print();

		System.out.println("------------------------");
		System.out.println(obj.sum());
	}
}

