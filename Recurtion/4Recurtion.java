


class Demo{

	void fun(int num){
	
		if(num==0){
		
			return;
		}
		System.out.println(num);

		--num;

		fun(num);
	}

		public static void main(String[] a){
		
			Demo obj = new Demo();

			obj.fun(2);
		}

}

