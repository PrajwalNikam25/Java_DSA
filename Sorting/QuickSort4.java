
class Quick{
	
	int part(int arr[],int start,int end){
	
		int i = start-1;
		int pivot  = arr[end];

		for(int j=start;j<end;j++){
		
			if(arr[j] <= pivot){
			
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


	void Sort(int arr[],int start,int end){
	
		if(start < end){
		
			int pivot = part(arr,start,end);

			Sort(arr,start,pivot-1);
			Sort(arr,pivot+1,end);
		}
	}
}

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,5,2,4,3};

		Quick obj = new Quick();

		obj.Sort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

	}
}

