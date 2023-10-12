
import java.util.*;

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{16,17,3,4,5,2};

		int n = arr.length;

		int max =0;

		int count =0;

		ArrayList al = new ArrayList();

		for(int i=n-1;i>=0;i--){
		
			max = arr[n-1];

			for(int j = n-1;j>=i;j--){
			
				if(max<arr[j]){
				
					max = arr[j];

					count++;
				}
			}	
		}
	


	}
}
