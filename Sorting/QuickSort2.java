class QuickSort{

	int part(int arr[],int start,int end){
	
		int pivot = arr[end];

		int i = start-1;

		for(int j=start;j<end;j++){
		
			if(arr[j] <= pivot){
			
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}		
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end]= temp;

		return i;
	}
	void m(int arr[],int start,int end){
	
		if(start < end){
		
			int pivot = part(arr,start,end);

			m(arr,start,pivot-1);
			m(arr,pivot+1,end);
		}
	}
}

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,3,5,6,32,5,6};

		QuickSort obj = new QuickSort();

		obj.m(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
