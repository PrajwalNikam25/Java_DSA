



class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,9,9};

		StringBuilder str = new StringBuilder();

		for(int i=0;i<arr.length;i++){
		
			str.append(arr[i]);
		}
		String str1 = new String(str);

		int temp = Integer.parseInt(str1);

		temp = temp + 1;

		String str2 = new String(temp+"");
		
		int arr2[] = new int[str2.length()];

		for(int i=0;i<str2.length();i++){
		
			arr2[i] = str2.charAt(i)-48;

			System.out.println(arr2[i]);
		}

	}
}
