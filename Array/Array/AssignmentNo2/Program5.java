

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,4,2,5,6,7,10,8,8,8,8,8,8,8,8,9};

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max = arr[i];
			}
			if(arr[i]<min){
			
				min = arr[i];
			}
		}
		for(int i=min;i<=max;i++){
		
			int count = 0;

			for(int j = 0;j<arr.length;j++){
			
				if(i==arr[j]){
				
					count++;
				}
			}
			if(count==0){
			
				System.out.println(i);
			}

		}
	}
}
