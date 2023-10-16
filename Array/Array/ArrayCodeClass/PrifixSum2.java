

import java.util.*;

class Client{


	public static void main(String[] a){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-3,3,1};

		int N=10;
		int Q = 3;

		Scanner sc = new Scanner(System.in);
		 
		for(int i=1;i<=Q;i++){

			int sum =0;
			
			int start = sc.nextInt();
			int end = sc.nextInt();

			for(int j = start;j<=end;j++){
			
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
	}
}
