

// Claculate the Sum of row:


class Demo{

	public static void main(String[] a){
	
		int arr[][] = new int[][]{{1,2,4,5},{3,5,6,7},{3,4,5,3}};

		int sum = 0;
		 
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	
	}
}
