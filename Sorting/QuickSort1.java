
class Demo{

	int part(int arr[],int start,int end){
	
		int pivot = arr[end];

		int i = start - 1;

		for(int j=start;j<end;j++){
		
			if(pivot >= arr[j]){
			
				i++;
				int temp = arr[i];
		 		arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}
	void QuickSort(int arr[],int start,int end){
	
		if(start < end){
		
			int pivot = part(arr,start,end);

			QuickSort(arr,start,pivot-1);
			QuickSort(arr,pivot+1,end);
		}
	}
}

class Quick{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,5,4,2,7,9};

		Demo obj = new Demo();

		obj.QuickSort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
