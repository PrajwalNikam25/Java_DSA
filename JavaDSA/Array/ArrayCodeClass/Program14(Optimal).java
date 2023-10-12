// Optimal Solution:


class Demo{

	public static void main(String[] a){
	
		char arr[] = new char[]{'b','a','a','a','c','g','g','g'};

		int pair = 0;
		int count = 0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
			
				count++;
			}else if(arr[i]=='g'){
			
				pair =pair +count;
			}
		}
		System.out.println(pair);
	}
	
}
