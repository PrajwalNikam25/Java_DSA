

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{16,17,4,3,20,2};

		int n = arr.length;

		int max =0;

		int arr2[] = new int[arr.length];

		for(int i=0;i<arr.length;i++){
		
			max = Integer.MIN_VALUE;
		
			for(int j=0;j<=i;j++){
			
				if(max<arr[j]){
				
					max = arr[j];
				}
			}
			arr2[i]=max;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr2[i]);
		}
	}
}
