


class Demo{

	int fun(int num){
	
		if(num==1){
		
			return 1;
		}
		num = num + fun(--num);

		return num;
	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		int ret = obj.fun(5);
		System.out.println(ret);


	}
}
