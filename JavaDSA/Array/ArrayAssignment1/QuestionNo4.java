

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int arr1[][] = new int[][]{{1,4},{3,5}};

		int sum = 0;

		for(int i=0;i<arr1.length;i++){
		
			int start = arr1[i][0];
			int end = arr1[i][1];

			System.out.println(start);
			System.out.println(end);

			for(int j=start;j<end;j++){
			
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
	}
}
