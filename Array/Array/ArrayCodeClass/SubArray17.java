


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{4,2,10,3,12,-2,15};

		int sum = 0;
		int count = 0;
		for(int i=0; i<arr.length;i++){
		
			for(int j=1;j<arr.length;j++){
			
				count++;

			}
		}
		System.out.println(count);
	}
}
