


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{6,-3,-10,0,2};

		int length = Integer.MIN_VALUE;

		int temp = 0;

		for(int i=0;i<arr.length;i++){
		
			int mult = 1;

			for(int j = i;j<arr.length;j++){
			
				mult = mult * arr[j];

				if(mult > length){
				
					length = mult;
				}
			}
			temp = length;
		}
		System.out.println(temp);
	}
}
