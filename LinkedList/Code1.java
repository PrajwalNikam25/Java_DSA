

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

	void print(){
	
		Node temp = head;

		while(temp != null){
		
			System.out.println(temp.data);

			temp= temp.next;
		}
	}

	void SS(){
	
		Node temp = head;

		String str= "";

		while(temp != null){
		
			str = str + temp.data;

			temp = temp.next;
		}
		System.out.println(str);

		int s = Integer.parseInt(str);

		System.out.println(s);
	}
}
class Client{

	public static void main(String[] a){
	
		LL obj = new LL();
		LL obj1 = new LL();

//		obj1.add(1);
//		obj2.add(2);


		obj.addNode(3);
		obj.addNode(2);

		obj.print();

		obj.SS();
	}
}
