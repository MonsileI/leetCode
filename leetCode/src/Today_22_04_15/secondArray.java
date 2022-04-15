package Today_22_04_15;



public class secondArray {

	public static void main(String[] args) {
		
		int[]prices = {7,1,5,3,6,4};
		int answer = 0;
		
		//하루에 사고 그담날 팔고
		//가장 큰 값
		//모든 조합에서 -+-+사고 팔고 사고 팔고 근데 순서는 있어야됨(순열 , dfs 불가능)
		int temp = prices[0];
		for(int i=1;i<prices.length;i++) {
			
			if(prices[i] - temp>0) {
				answer += prices[i] - temp;
			}
			
			temp = prices[i];
			
		}
			
		System.out.println(answer);
		
		
		
		
	}
}