


//Print all SubArray:


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		for(int i =0; i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				for(int k=i;k<=j;k++){
				
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
