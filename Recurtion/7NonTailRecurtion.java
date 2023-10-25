



class Demo{

	int fun(int num){
	
		if(num==1){
		
			return 1;
		}
		return fun(--num) + 3;
	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		System.out.println("Start main");

		int ret = obj.fun(2);
		System.out.println(ret);

		System.out.println("End main");


	}
}
