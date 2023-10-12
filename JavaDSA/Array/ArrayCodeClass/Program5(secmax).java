 



class Client{

	public static void main(String[] s){

		int arr[] = new int[]{8,5,6,7,3,2,1};

		int max = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max=arr[i];
			}
		}
		int secMax = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>secMax && arr[i]!=max){
			
				secMax = arr[i];
			}
		}
		System.out.println(secMax);
	}
}
