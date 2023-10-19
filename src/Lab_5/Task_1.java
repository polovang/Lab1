package Lab_5;

public class Task_1 {
	// Task1.1, adding two matrices
	public static int[][] add(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			return null;
		} else {
			int[][] re = new int[a.length][a[0].length];
			for (int i = 0; i < re.length; i++) {
				for (int j = 0; j < re[0].length; j++) {
					re[i][j] = a[i][j] + b[i][j];

				}
			}

			return re;
		}

	}

	// Task1.2, subtract two matrices
	public static int[][] sub(int[][] a, int[][] b) {
		int[][] re = new int[a.length][a[0].length];
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re[0].length; j++) {
				re[i][j] = a[i][j] - b[i][j];

			}
		}
		return re;

	}

	// Task1.3, multiply two matrices
	public static int[][] mul(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			return null;
		} else {
			int[][] re = new int[a.length][b[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					int c = 0;
					for (int k = 0; k < b.length; k++) {
						c += a[i][k] * b[k][j];
					}
					re[i][j] = c;
				}
			}

			return re;
		}

	}

	// Task1.4, transposing give matrices
	public static int[][] tranpose(int[][] a) {
		int[][] re = new int[a[0].length][a.length];
		for (int i = 0; i < re[0].length; i++) {
			for (int j = 0; j < re.length; j++) {
				re[j][i] = a[i][j];
			}
		}
		return re;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 6, 7, 8 }, { 3, 6, 9 } };
		int[][] re = add(a, b);
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re[0].length; j++) {
				System.out.print(re[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("---");
		int[][] re1 = sub(a, b);
		for (int i = 0; i < re1.length; i++) {
			for (int j = 0; j < re1[0].length; j++) {
				System.out.print(re1[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("---");
		int[][] a1 = { { 1, 2 }, { 3, 4 } };
		int[][] b1 = { { 2, 3, 4 }, { 5, 6, 7 } };
		int[][] re2 = mul(a1, b1);
		for (int i = 0; i < re2.length; i++) {
			for (int j = 0; j < re2[0].length; j++) {
				System.out.print(re2[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("---");
		int[][] a2 = { { 2, 5, 4 }, { 5, 6, 2 } };
		int[][] re3 = tranpose(a2);
		for (int i = 0; i < re3.length; i++) {
			for (int j = 0; j < re3[0].length; j++) {
				System.out.print(re3[i][j] + " ");

			}
			System.out.println();
		}
	}

}
