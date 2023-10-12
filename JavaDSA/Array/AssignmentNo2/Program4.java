

class Demo{

	public static void main(String[] a){
	
		int x = 7;

		int arr[] = new int[]{2,3,1,2,4,3};

		int length = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){
		
			int sum =0;

			for(int j = i;j<arr.length;j++){
			
				sum = sum + arr[j];

				if(sum == x){
				
					int temp = j-i+1;

					if(temp < length){
					
						length = temp;
					}
				}
			}
		}
		if(length==Integer.MAX_VALUE){
		
			System.out.println("0");
		}else{
		
			System.out.println(length);
		}
	}
}
