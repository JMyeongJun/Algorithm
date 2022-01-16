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
				
		for(int i = 1; i<10000; i++) {
			
			boolean chk = false;
			
			for(int j = 1; j<10000; j++) {
				if(i == d(j)) {
					chk = true;
					break;
				}
			}
			
			if(!chk) {
				System.out.println(i);
			}
		}
	}
}
