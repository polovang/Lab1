package lab2;

import java.util.Arrays;

public class Task_1 {
	// Task_1.1
	public static int getSn1(int n) {
		int a = 0;
		if (n == 1) {
			return 1;
		} else {

			a = (int) (a + Math.pow((-1), n + 1) * n);
			getSn1(n - 1);
			return a + getSn1(n - 1);
		}

	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int getSn2(int n) {
		if (n == 1) {
			return 1;

		} else {
			return getSn2(n - 1) + factorial(n);
		}
	}

	public static int getSn3(int n) {
		if (n == 1) {
			return 1;

		} else {
			return (int) (getSn3(n - 1) + Math.pow(n, 2));
		}
	}

	private static int factorial1(int i) {

		if (i == 0) {
			return 1;
		} else {

			return i * factorial1(i - 2);
		}
	}

	public static double getSn4(int n) {
		if (n == 0) {
			return 1;
		} else {
			return getSn4(n - 1) + 1 / (double) (factorial1(2 * n));
		}

	}

	// Task_1.2
	public static int getFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	public static void printFibonacci(int n) {
		if (n <= 0) {
			System.out.println("Invalid input");
			return;
		}
		for (int i = 0; i <= n; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
	}

	// Task_1.3
	public static void printPasscalTraingle(int row) {
		int[][] re = new int[row][];
		for (int i = 0; i < re.length; i++) {
			re[i] = new int[i + 1];
			re[i][0] = 1;
			re[i][i] = 1;
			for (int j = 1; j < i; j++) {
				re[i][j] = re[i - 1][j - 1] + re[i - 1][j];
			}
		}
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re[i].length; j++) {
				System.out.print(re[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] re = new int[prevRow.length + 1];
		re[0] = 1;
		re[re.length - 1] = 1;
		for (int i = 1; i < re.length - 1; i++) {
			re[i] = prevRow[i - 1] + prevRow[i];
		}
		return re;
	}

	public static int[] getPasscalTriangle(int n) {
		if (n == 1) {
			return new int[] { 1 };

		} else {
			int[] preRow = getPasscalTriangle(n - 1);
			return generateNextRow(preRow);

		}
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(getSn1(n));

		int m = 3;
		System.out.println(getSn2(m));

		int m1 = 3;
		System.out.println(getSn3(m1));

		int m2 = 2;
		System.out.println(getSn4(m2));

		int m3 = 4;
		System.out.println(getFibonacci(m3));

		int m4 = 5;
		printFibonacci(m4);
		System.out.println();
		int[] input = { 1, 1, 1 };
		int[] re = generateNextRow(input);
	    System.out.print(Arrays.toString(re));


		System.out.println();
		
		int [] result= getPasscalTriangle(5);
		System.out.println(Arrays.toString(result));


		printPasscalTraingle(5);

	}

}
