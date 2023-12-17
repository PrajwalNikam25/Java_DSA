

class Node{

	int data;

	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class LL{

	Node head = null;

	void AtPos(int pos , int data){
	
		if(pos == 1){
		
			head = newNode;
		}else if(pos == count()+1){
		
			temp = head;

			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}else{
		
			int cNode(){
			
				int count =0;

				Node temp = head;

				while(temp != null){
				
					count++;

					temp = temp.next;
				}
				return count;
			}
			while(pos-2 != 0){
			
				temp = temp.next;

				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
}

		void print(){
		
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

		obj.AtPosition(1,10);

		obj.print();
	
	}
}
