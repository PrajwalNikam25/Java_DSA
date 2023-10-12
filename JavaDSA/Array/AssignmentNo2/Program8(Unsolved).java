

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,3,3,3,4,5,6,7};

		for(int i=0; i<arr.length;i++){
		
			for(int j = arr.length-1;j>=0;j--){
			
				if(arr[i]==arr[j]){
				
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
		}
	}
}
