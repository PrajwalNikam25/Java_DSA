

class Node{

	int data;

	Node next = null;

	Node last = null;

	Node(int data){
	
		this.data = data;
	}
}
class LL{

	Node head = null;

	// AddNode:

	void addNode(int data){
	
		Node newNode = new Node(data);

		Node temp = head;

		while(temp.next != null){

			temp = temp.next;
		}
		temp.next = newNode;
	}

	// addFirst:
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head = null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			head = newNode
		}
	}

	//addLast:
	
	void addLast(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			addFirst(data);
		}else{
			Node temp = head;
			
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// detFirst:
	void detFirst(){
	
		if(head == null){
		
			System.out.println("List is Empty");
		}else{
		
			head = head.next;
		}
	}

	//countNode():
	
	int countNode(){
	
		Node temp = head;

		int count = 0;

		while(temp != null){
		
			temp = temp.next;
			count++;
		}
		return count;
	}

	// detLst:
	void detLast(){
	
		if(head == null){
		
			System.out.println("List is Empty");
		}else if{

			if(countNode() == 1){
			
				head = null;
			}
		}else{
		
			Node temp = head;

			while(temp.next.next != null){
			
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	//detAtPosition:
	void detPosition(int pos, int data){
	

	}
}
