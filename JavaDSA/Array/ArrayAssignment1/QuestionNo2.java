


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,2};

		int n = 2;

		int count=0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i] == n){
			
				count++;
			}
	
		}
		System.out.println(count);
	}
}
