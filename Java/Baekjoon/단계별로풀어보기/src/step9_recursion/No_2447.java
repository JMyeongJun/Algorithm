package step9_recursion;

public class No_2447 {
	public static void main(String[] args) {
		star(9);
	}

	public static void star(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if ((i + 1) % 3 == 0) {
				System.out.print(" ");
				continue;
			}
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}
//	public static void star(int n) {
//		System.out.println("***");
//		System.out.println("* *");
//		System.out.println("***");
//		
//	}
}
