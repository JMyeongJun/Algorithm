package step7_basicMath1;

import java.util.Scanner;

public class No_1193 {
	// 1   3   6   10  15  21  28
	//  +2  +3  +4  +5  +6  +7
	
	// ���������� �� --> Sigma(n{a1+(n-1)d}/2)= n(n+1)/2
	// ���������� ���� ã�� �ε����� �����Ѵ�
	// ==>  x<=n(n+1)/2  �Ͻ�, x�� �ش� �ε����� �밢������ ��ġ!!
	
	// x�� ���������� ���� �� ��ŭ �м��� �и� ���� ���ϰų� ���ش�
	// �̶�, �ε����� Ȧ������ ¦������ �����ؼ� ��� ���ϰų� ���� ���Ѵ�
	
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
