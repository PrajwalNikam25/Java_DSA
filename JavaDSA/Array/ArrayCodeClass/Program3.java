


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{3,5,2,-3,7,8,15,1,9,6,13};

		int count=0;

		int k=10;

		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				if(arr[i]+arr[j]==k && i!=j){
				
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
