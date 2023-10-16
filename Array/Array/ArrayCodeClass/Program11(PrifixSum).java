// Prefix sum


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,5,6,7,8};

		for(int i=1;i<arr.length;i++){
		
			arr[i] = arr[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);

		}

	}
};
