
class Client{

	void m(int arr[],int start,int mid,int end){
	
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int num1[] = new int[n1];
		int num2[] = new int[n2];

		for(int i=0;i<n1;i++){
		
			num1[i] = arr[start + i];
		}
		for(int i=0;i<n2;i++){
		
			num2[i] = arr[mid + i + 1];
		}

		int i=0;int j=0;int k=start;
		while(i < n1 && j < n2){
		
			if(num1[i] < num2[j]){
			
				arr[k] = num1[i];
				i++;
			}else{
			
				arr[k] = num2[j];
				j++;
			}
			k++;
		}
		while(i < n1){
		
			arr[k] = num1[i];
			i++;
			k++;
		}
		while(j < n2){
		
			arr[k] = num2[j];
			j++;
			k++;
		}
	}

	void merge(int arr[],int start,int end){
	
		if(start<end){
		
 			int mid = start + (end - start)/2;

			merge(arr,start,mid);
			merge(arr,mid+1,end);
			m(arr,start,mid,end);
		}
	}
}
class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,4,12,3,5,9,11,6};

		Client obj = new Client();

		obj.merge(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
