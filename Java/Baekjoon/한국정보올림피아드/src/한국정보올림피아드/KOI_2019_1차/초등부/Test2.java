package 한국정보올림피아드.KOI_2019_1차.초등부;

public class Test2 {

	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 8, 7 };
		System.out.println(solution(a));
	}

	public static int solution(int[] prices) {
		int answer = 0;
		int min = 1000000;
		int max = 0;
		int min_idx = -1;
		int max_idx = -1;

		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
				min_idx = i;
			}
			if(prices[i] > max) {
				max = prices[i];
				max_idx = i;
			}
		}
		
		if(min_idx <= max_idx) {
			answer = prices[max_idx] - prices[min_idx];
		}else {
			for (int i = prices.length - 1; i >= 1; i--) {
				for (int j = i - 1; j >= 0; j--) {
					int earn = prices[i] - prices[j];
					if (earn > answer) {
						answer = earn;
					}
				}
			}
		}

		return answer;
	}
}
