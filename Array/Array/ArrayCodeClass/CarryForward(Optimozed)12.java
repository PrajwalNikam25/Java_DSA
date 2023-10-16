



class Clinet{

	public static void main(String[] a){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int arr2[] =new int[arr.length];

		int n = arr.length;

		arr2[0] = arr[0];

		for(int i=1;i<arr.length;i++){
		
			int max = Integer.MIN_VALUE;
		
			if(arr[i]<arr[i-1]){
			
				max = arr[i-1];
			}

			arr2[i] = max;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr2[i]);
		}
	}
}
