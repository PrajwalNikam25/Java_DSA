
// Carry Forward:
// LeftMax:

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int arr2[] = new int[arr.length];

		for(int i=0;i<arr.length;i++){
		
			int max = Integer.MIN_VALUE;

			for(int j=0;j<=i;j++){
			
				if(max<arr[j]){
				
					max=arr[j];
				}
				arr2[i]=max;
			}
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr2[i]);
		}
	}
}
