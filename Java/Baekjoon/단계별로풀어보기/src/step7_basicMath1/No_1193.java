package step7_basicMath1;

import java.util.Scanner;

public class No_1193 {
	// 1   3   6   10  15  21  28
	//  +2  +3  +4  +5  +6  +7
	
	// 등차수열의 합 --> Sigma(n{a1+(n-1)d}/2)= n(n+1)/2
	// 등차수열의 합은 찾는 인덱스를 포함한다
	// ==>  x<=n(n+1)/2  일시, x는 해당 인덱스의 대각선위에 위치!!
	
	// x와 등차수열의 합의 차 만큼 분수와 분모를 각각 더하거나 빼준다
	// 이때, 인덱스가 홀수인지 짝수인지 구분해서 어떻게 더하거나 뺄지 정한다
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), num = 0, i = 1;
		sc.close();
		
		while(true) {
			num += i;
			
			if(x<=num) {
				if(i%2 == 0) {
					System.out.println(i-(num-x) + "/" + (1+num-x));
					break;
				}else {
					System.out.println(1+(num-x) + "/" + (i-(num-x)));
					break;
				}
			}
			
			i++;
		}
	}
}
