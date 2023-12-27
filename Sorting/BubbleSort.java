

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,4,3,2,6,5};
		
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

		for(int i =0;i<arr.length-1;i++){
		
			int minIndex = i;

			for(int j=i+1;j<arr.length;j++){
			
				if(arr[j] < arr[minIndex]){
				
					minIndex = j;
				}
			}
			int temp = arr[i];

			arr[i] = arr[minIndex];

			arr[minIndex] = temp;
		}
		System.out.println("---------------------");

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

	}
}
