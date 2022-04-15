package Today_22_04_15;

import java.util.TreeSet;

public class firstArray_Solution {

	public static void main(String[] args) {
		
		int []nums = {1,1,2};
		
		int[]answer = new int[nums.length];
		
		TreeSet<Integer> test = new TreeSet<>();
		
		for(int i : nums) {
			test.add(i);
		}
		int i = 0;
		for(Integer j : test) {
			nums[i++] = j;
			}
		
		System.out.println(i);
	}
		
		
	
}
