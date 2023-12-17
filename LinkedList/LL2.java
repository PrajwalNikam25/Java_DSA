

class Node{

	int data;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class LL{
	
	Node head = null;
	
	// Add First Element;
	
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			newNode.next = head;
			
			head = newNode;
		}
	}

	// AddLast Element;
	
	void addLast(int data){
	
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
	// count:
	
	int countNode(){
	
		int count=0;

		Node temp = head;

		while(temp != null){
		
			count++;

			temp = temp.next;
		}
		return count;
	}

	// AtPosition:
	

	void AtPosition(int pos,int data){

		Node newNode = new Node(data);
	
		if(pos == 1){
		
			addFirst(data);
		}else if(pos == countNode()+1){
		
			addLast(data);
		}else{
		
			Node temp = head;

			while(pos-2 != 0){
			
				temp = temp.next;

				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

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
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();

		obj.addLast(50);
		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.AtPosition(3,45);

		obj.print();

		int count = obj.countNode();

		System.out.println(count);
	}
}
