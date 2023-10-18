

// Trancepose Matrix:


class Demo{

	public static void main(String[] a){
	
		int arr[][] = new int[][]{{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21},{22,23,24,25,26,27,28},{29,30,31,32,33,34,35},{36,37,38,39,40,41,42},{43,44,45,46,47,48,49}};

		for(int i =0;i<7;i++){
		
			for(int j =i+1;j<7;j++){
			
				int temp = arr[i][j];

				arr[i][j] = arr[j][i];

				arr[j][i] = temp;
			}
		}
		for(int i =0;i<7;i++){
		
			for(int j =0;j<7;j++){
			
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
