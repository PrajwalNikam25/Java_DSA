


class Demo{

	public static void main(String[] a){
	
		String arr[] = new String[]{"i","love","leetcode","Apple"};

		String s = "iloveleetcodeApple";

		boolean flag = false;
		StringBuilder str = new StringBuilder();

		for(int i=0;i<arr.length;i++){
		
			str.append(arr[i]);
		}
		String str1 = new String(str);
		
		if(str1.equals(s)){
		
			flag = true;
		}
		System.out.println(flag);
	}
}
