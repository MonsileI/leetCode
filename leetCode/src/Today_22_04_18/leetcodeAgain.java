package Today_22_04_18;

import java.util.HashSet;
import java.util.Set;

public class leetcodeAgain {
	
	public static void main(String[] args) {
		
		
	int[] nums = {1,2,3,1};
	
	boolean answer = false;
	
	Set<Integer> check = new HashSet<Integer>();
	
	for(int i : nums)check.add(i);
	
	if(nums.length!=check.size()) answer = true;
	
	System.out.println(answer);
		
	}
		

}
