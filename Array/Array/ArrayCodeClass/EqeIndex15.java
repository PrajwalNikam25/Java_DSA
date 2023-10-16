

// Equlidium index:


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{-7,1,5,2,-4,3,0};

		int flag = 0;

		int sumL = 0;
		int sumR = 0;

		for(int i=3;i<arr.length;i++){
		
			for(int j=0;j<i;j++){
			
				sumL = sumL + arr[j];
			}
			for(int j=i+1;j<arr.length;j++){
			
				sumR = sumR + arr[j];
			}

			if(sumL == sumR){
			
				flag = 1;
				System.out.println(i);
				break;
			}
		}
		System.out.println(sumL);
		System.out.println(sumR);
		if(flag==0){
		
			System.out.println("-1");
		}
	}
}
