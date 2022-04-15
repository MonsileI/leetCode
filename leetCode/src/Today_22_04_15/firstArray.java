package Today_22_04_15;

public class firstArray {

	public static void main(String[] args) {
		
		int []nums = {1,1,2};
		
		int[]answer = new int[nums.length];
		
		answer[0] = nums[0];
		
		int comp = nums[0];
		
		int num = 1;
		
		int result = 1;
		
		for(int i=1;i<nums.length;i++) {
			
			if(comp==nums[i]) continue;
			else {
				answer[num] = nums[i];
				num++;
				comp = nums[i];
				result++;
						
			}
			
			
		}
		
		
		for(int i=0;i<answer.length;i++) nums[i] = answer[i];
		
		System.out.println(result);
		
	}
}
