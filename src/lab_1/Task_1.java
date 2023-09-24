package lab_1;


import java.util.Arrays;

public class Task_1 {
	private int[] array;

	public Task_1(int[] array) {

		this.array = array;
	}

	public int[] mirror() {
;
		
		int[] array1 = new int[array.length * 2];
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			array1[i] = array[a];
			a++;
		}
		for (int j = array.length - 1; j >= 0; j--) {
			array1[a] = array[j];
			a++;
		}
		return array1;
	}

	public int[] removeDuplicates() {
		int[] newArray = new int[array.length];
		int index1 = 0;
		for (int i = 0; i < array.length; i++) {
			boolean b = false;
			for (int j = 0; j < index1; j++) {
				if (array[i] == newArray[j]) {
					b = true;
					break;
				}
			}
			if (b == false) {
				newArray[index1] = array[i];
				index1++;
			}

		}
		return newArray;
	}

	public int[] getMissValues() {
		int[] newArray2 = new int[(array[array.length - 1] - array[0] + 1) - array.length];
		int dem = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] > 1) {
				for (int j = array[i] + 1; j < array[i + 1]; j++) {
					newArray2[dem] = j;
					dem++;
				}
			}
		}
		return newArray2;
	}

	public int[] fillMissValues(int k) {
		int[] array1 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == k) {
				array1[i] = array[i - 1];
			} else {
				array1[i] = array[i];

				for (int j = i - 1; j >= 0; j--) {
					if (array[i] == array[j]) {
						array1[i] = array[i + 1] - 1;

					}

				}
			}

		}
		return array1;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		Task_1 task_1 = new Task_1(input);
		int[] output = task_1.mirror();

		System.out.println(Arrays.toString(output));

		System.out.println("---");
		int[] input1 = { 1, 2, 3, 4, 3, 2, 8, 6, 7, 9 };
		Task_1 task_2 = new Task_1(input1);
		int[] output1 = task_2.removeDuplicates();
		System.out.println(Arrays.toString(output1));

		System.out.println("---");
		int[] input2 = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		Task_1 task_3 = new Task_1(input2);
		int[] output2 = task_3.getMissValues();
		System.out.println(Arrays.toString(output2));

		System.out.println("---");
		int[] input3 = { 10, 11, 12, -1, 14, 10, 17, 19, 20 };
		Task_1 task_4 = new Task_1(input3);
		int[] output3 = task_4.fillMissValues(3);
		System.out.println(Arrays.toString(output3));
	}
}

