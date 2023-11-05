


class Client{

	void fun(int x){
	
		if(x == 0){
		
			return ;
		}
		System.out.println(x);

		x--;

		fun(x);
	}
}
class Demo{

	public static void main(String[] a){
	
		Client obj = new Client();

		obj.fun(10);
	}
}
