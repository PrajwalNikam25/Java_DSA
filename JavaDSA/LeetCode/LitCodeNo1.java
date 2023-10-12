

import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {
	    
    ArrayList al = new ArrayList();

       for(int i=1;i<nums.length;i++){

            if(nums[i] + nums[i-1] == 9){

                al.add(i-1);
                al.add(i);
            }
        }
    int arr[] = new int[al.size()];

        for(int i=0;i<al.size();i++){

             System.out.println(al.get(i));
        }
        return arr;
    }
}
class Client{

	public static void main(String[] a){
	
		int nums[] = new int[]{2,7,11,15};

		int target = 9;

		Solution obj = new Solution();

		obj.twoSum(nums,target);
		
	}
}
