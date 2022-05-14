package step9_recursion;

import java.util.Scanner;

public class No_17478 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion("", n);
		sc.close();
	}
	
	public static void recursion(String underline, int num) {
		System.out.println(underline + "\"����Լ��� ������?\"");
		if(num >= 1) {
			System.out.println(underline + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println(underline + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println(underline + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			recursion(underline + "____", num - 1);
		}else {
			System.out.println(underline + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		}
		System.out.println(underline + "��� �亯�Ͽ���.");
	}
}
