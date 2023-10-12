


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-3,3,1};

		int psarr[] = new int[arr.length];

		psarr[0]=arr[0];

		for(int i=1;i<arr.length;i++){
		
			psarr[i] = psarr[i-1]+arr[i];

		}
		
		Scanner sc = new Scanner(System.in);

		int sum=0;

		for(int i=1;i<3;i++){
		
			int s = sc.nextInt();

			int e = sc.nextInt();

			for(int j=s;j<e;j++){
			
				if(s==0){
				
					sum = psarr[e];
				}else{
				
					sum = psarr[e] - psarr[s-1];
				}
			}
		}
	}
}
