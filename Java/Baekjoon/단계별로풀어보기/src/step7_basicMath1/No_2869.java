package step7_basicMath1;

import java.util.Scanner;

// v : �����̰� �ö� ���� ���� ����
// a : ���� �ö� �� �ִ� �Ÿ�
// b : �㿡 �̲������� �Ÿ�

// �Է�)
// ù° �ٿ� �� ���� a, b, v�� �������� ���еǾ �־����� 
// (1<=b<a<=v<=1,000,000,000)

// ������ ������ �Ŀ��� �̲������� �ʴ´�

// ���)
// �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ���

public class No_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		sc.close();

		if (v <= a) {
			System.out.println(1);
		} else {
			v -= a;
			v = (int) Math.ceil(v / (double) (a - b));
//			System.out.println("v : " + v);
			System.out.println(1 + v);
		}

		// �ð��ʰ�
//		int pos = 0, day = 1;
//		
//		while(true) {
//			pos += a;
//			if(pos>= v) {
//				System.out.println(day);
//				break;
//			}
//			
//			pos -= b;
//			day++;
//		}

	}
}
