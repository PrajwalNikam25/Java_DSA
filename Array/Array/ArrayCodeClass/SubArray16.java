

// SubArray:


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};

		int temp = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int minlen = 0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max=arr[i];
			}
			if(arr[i]<min){
			
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]==min){
			
				for(int j=i+1;j<arr.length;j++){
				
					if(arr[j]==max){
					
						minlen = j-i+1;
						
						if(minlen<temp){
						
							temp=minlen;
						}
					}
				}
			}
			if(arr[i]==max){
			
				for(int j=i+1;j<arr.length;j++){
				
					if(arr[j]==min){
					
						minlen = j-i+1;
					
						if(minlen<temp){
						
							temp=minlen;
						}	
					}
				}
			}
		}

		System.out.println(temp);

	}
}
	
