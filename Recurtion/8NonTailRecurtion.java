

class Demo{

	int sum=0;

	int fun(int num){
	
		if(num==0){
		
			return sum;
		}
		sum = sum + num;

		num--;

		fun(num);

		return sum;

	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		int ret = obj.fun(5);

		System.out.println(ret);


	}
}
