

class SelectionSort{

	public static void main(String[] a){

	int arr[] = new int[]{2,4,7,2,4,5};

	for(int i=0;i<arr.length;i++){
	
		int min = i;

		for(int j=i+1;j<arr.length;j++){
		
			if(arr[min] > arr[j]){
			
				min = j;
			}
		}
		int temp = arr[i];

		arr[i] = arr[min];

		arr[min] = temp;
	}

	for(int i=0;i<arr.length;i++){
	
		System.out.println(arr[i]);
	}

	
	}
}
