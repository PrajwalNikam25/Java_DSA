

// i<j
// arr[i]='a'
// arr[j]='g'


class Demo{

	public static void main(String[] a){
	
		char arr[] = new char[]{'b','a','a','a','c','g','g','g','g'};

		int count= 0;
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
			
				for(int j = i+1;j<arr.length;j++){
				
					if(arr[j]=='g'){
					
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
