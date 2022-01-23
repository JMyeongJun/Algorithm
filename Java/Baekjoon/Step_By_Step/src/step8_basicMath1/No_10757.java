package step8_basicMath1;

import java.util.Scanner;

public class No_10757 {
	// �ڸ��� ���ߴ� �Լ� (0���� ä��)
	static String digits(String str, int n) {
		for (int i = 0; i < n; i++) {
			str = "0" + str;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next(), result = "";
		int up = 0;	// ĳ��(�ø�)
		sc.close();
		
		// �ڸ��� ���߱�
		if (a.length() - b.length() > 0) {
			b = digits(b, a.length() - b.length());
		} else if (b.length() - a.length() > 0) {
			a = digits(a, b.length() - a.length());
		}
		
		for (int i = a.length() - 1; i >= 0; i--) {
			result = (Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + up) % 10
					+ result;
			
			// ĳ�� ����
			if (Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + up >= 10) {
				up = 1;
			} else {
				up = 0;
			}
		}
		
		if (up == 1) {
			result = up + result;
		}
		
		System.out.println(result);
	}
}
