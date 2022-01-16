package step6_func;

public class No_4673 {
	static int d(int num) {
		int ret = num;

		while (num != 0) {
			ret += num % 10;
			num /= 10;
		}

		return ret;
	}

	public static void main(String[] args) {
		boolean[] selfCheck = new boolean[10001];

		for (int i = 1; i <= 10000; i++) {
			int n = d(i);

			if (n <= 10000) {
				selfCheck[d(i)] = true;
			}
		}
		
		for(int i = 1; i<=10000; i++) {
			if(!selfCheck[i]) {
				System.out.println(i);
			}
		}
	}
}
