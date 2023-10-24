// print the range of array it give the target Sum:
//
//


class Demo{

	public static void main(String[] a){
	
		int t = 15;
		int arr[] = new int[]{1,2,3,7,5};
		int sum =0;


		for(int i=0;i<arr.length;i++){

			sum = 0;
		
			for(int j=i;j<arr.length;j++){
			
				sum = sum + arr[j];

				if(sum == t){
				
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
