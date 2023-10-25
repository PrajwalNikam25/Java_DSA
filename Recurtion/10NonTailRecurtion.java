


class Demo{

	int rem=0;
	int sum=0;

	int fun(int num){
	
		if(num==0){
		
			return 1;
		}
		rem = num%10;

		sum = sum + rem;

		num = num/10;

		fun(num);

		return sum;
	}
	public static void main(String[] a){
	
		Demo obj = new Demo();

		int ret = obj.fun(123);

		System.out.println(ret);
	}
}
