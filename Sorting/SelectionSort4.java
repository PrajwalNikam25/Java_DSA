

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,5,2,4,3};

		for(int i=0;i<arr.length;i++){
		
			int midIndex = i;

			for(int j=i+1;j<arr.length;j++){
			
				if(arr[midIndex] > arr[j]){
				
					midIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[midIndex];
			arr[midIndex] = temp;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
