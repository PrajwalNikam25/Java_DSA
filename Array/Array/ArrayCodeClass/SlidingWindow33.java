// Print the Count of array Size is K


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};
		int count=0;
		int k =3;

		for(int i = 0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				int t = j-i+1;

				if(t==k){
				
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
