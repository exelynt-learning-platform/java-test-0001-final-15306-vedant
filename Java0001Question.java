public class Java0001Question {

	public static void main(String[] args) {
		int n = 5;
		// Upper Half
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i > 1) {
				for (int j = 1; j <= (2 * i - 3); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		// Lower Half
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i > 1) {
				for (int j = 1; j <= (2 * i - 3); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
