

class Demo{

	public static void main(String[] e){
	
		int arr[] = new int[]{1,2,3,4,6};

		int arr1[] = new int[2];

		int a = 5;

		for(int i=0;i<arr.length;i++){
		
			for(int j =i+1;j<arr.length;j++){

				if(arr[i]+arr[j] == a){
				
					 arr1[0]=i;
					 arr1[1]=j;
						
				break;	
				}
			}
		}
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}
	}
}
