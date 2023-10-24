

// Print one to ten number by using recurtion:


class Demo{

	void printnum(int num){
	
		System.out.println(num);

		if(num ==10){
		
			return;
		}
		num++;

		printnum(num);
	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		obj.printnum(1);
		
	}
}
