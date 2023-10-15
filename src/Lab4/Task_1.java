package Lab4;

import java.util.Arrays;

public class Task_1 {
	public static void intertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int re = i - 1;
			int check = array[i];
			while (re >= 0 && array[re] > check) {
				array[re + 1] = array[re];
				re--;

			}
			array[re + 1] = check;
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tempt = array[j];
					array[j + 1] = array[j];
					array[j] = tempt;
				}
			}
		}
	}

	public static void seclectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int a = i;
			for (int j = a + 1; j < array.length; j++) {
				if (array[j] < array[a]) {
					a = j;
				}
			}
			int tempt = array[i];
			array[i] = array[a];
			array[a] = tempt;
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 5, 10, 2, 45, 9, 1, 23, 78 };
		intertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int[] array1 = { 2, 4, 1, 56, 8 };
		System.out.println();
		seclectionSort(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

	}

}
