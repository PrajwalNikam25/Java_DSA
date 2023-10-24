


// print num 10 to 1:


class Demo{

	void printNum(int num){
	
		System.out.println(num);

		if(num == 1){
		
			return;
		}
		num--;

		printNum(num);
	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		obj.printNum(10);
	}
}
