

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{-2,1,-4,5,3,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99,9,1,-44,99};

		int min = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(min > arr[i]){
				
				min = arr[i];
			}
		}
		System.out.println(min);
		int max = arr[0];

		for(int i=0;i<arr.length;i++){
		
			if(max < arr[i]){
				
				max = arr[i];
			}
		}
		System.out.println(max);
	
		System.out.println(max + min);
	}
}
