

class Demo{

	int fun(int num){
	
		if(num==0){
		
			return 1;
		}

		return 5 + fun(--num);
	}
	public static void main(String[] a){
	
		System.out.println("Start Main");

		Demo obj = new Demo();

		int ret = obj.fun(2);
		
		System.out.println(ret);
		
		System.out.println("End Main");


	}
}
