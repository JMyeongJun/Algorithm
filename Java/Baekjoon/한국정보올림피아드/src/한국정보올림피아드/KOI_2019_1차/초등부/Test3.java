package 한국정보올림피아드.KOI_2019_1차.초등부;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(true){
			n = sc.nextInt();
			long[] ret = solution(n);
			System.out.println(ret[0] + "," + ret[1]);
		}
	}
	
	public static long[] solution(long n) {
		
		long min = (n / 7) * 2;
		if( n == ((min / 2) + 1) * 7 - 1) {
			min++;
		}
		
		long max = (n + 6) / 7 * 2;
		if( n == (((max / 2) - 1) * 7) + 1) {
			max--;
		}
		
        long []answer = {min,max};
        
        return answer;
    }
}	
