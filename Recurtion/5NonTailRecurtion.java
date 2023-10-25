

class Demo{

	void fun(int num){
	
		if(num==0){
		
			return;
		}
		fun(--num);

		System.out.println(num);

	}
	public static void main(String[] A){
	
		Demo obj = new Demo();
		
		obj.fun(2);
	}
}

