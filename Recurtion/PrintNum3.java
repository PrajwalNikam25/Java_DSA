// Print num 10 to 1:
// if method pass 10 number:


class Demo{

	int x =9;

	void printNum(int num){
	
		System.out.println(num - x);

		if(x == 0){
		
			return;
		}

		x--;

		printNum(num);


	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		obj.printNum(10);
	}
}
