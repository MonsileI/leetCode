package Today_22_04_15;

import java.util.HashMap;

public class fifthArray {
	
	public static void main(String[] args) {
		
		int [] nums = {4,1,2,1,2};
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int answer = 0;
		
		for(int i : nums)map.put(i, map.getOrDefault(i, 0)+1);
		

		for(int key:map.keySet()) {
			
			if(map.get(key)==1) {
				answer = key;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
