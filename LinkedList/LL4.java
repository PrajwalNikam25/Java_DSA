

class Node {

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
		
			newNode.next = head;

			head = newNode;
	}

	void print(){
	
		Node temp = head;

		if(head == null){
		
			System.out.println("Is Empty");
		}else{
		
			while(temp != null){
			
				System.out.println(temp.data);

				temp = temp.next;
			}
		}
	}
	
	int countNode(){
	
		Node temp = head;

		int count=0;

		while(temp != null){
		
			count++;
		}
		return count;
	}

	void detFirst(){
	
		if(head == null){
		
			System.out.println("Is Empty");
		}else{	
			head = head.next;
		}	
	}

	void detLast(){
	
		Node temp = head;

		if(head == null){
		
			System.out.println("Is Empty");
		}else{
		
			while(temp.next.next != null){
			
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	void detAtPosition(int data){

		if(head == null){
		
			System.out.println("Is Empty");
		}else{
		
			Node temp = head;
		
			while(data-2 == 0){
			
				temp = temp.next;
				data--;
			}
			temp.next = temp.next.next;
		}
	}
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();

		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.addFirst(40);
		obj.detAtPosition(2);

		obj.print();


	}
}


