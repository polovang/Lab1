package lab3;

import java.util.Arrays;

public class Task_1 {
	private int[] array;

	public Task_1(int[] array) {
		this.array = array;

	}

	public int interaveLinearSearch(int target) {

		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				return i;

			}
		}
		return -1;

	}

	public int recursiveLinearSearch(int target, int index) {

		if (index == array.length) {
			return -1;
		} else if (array[index] == target) {
			return index;

		} else {
			return recursiveLinearSearch(target, index + 1);
		}
	}

	public int recursiveLinearSearch1(int target) {
		return recursiveLinearSearch(target, 0);
	}

	// Task1_2
	public int iterrativeBinarySearch(int target) {
        Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public int recuriveBinarySearch(int target, int left, int right) {
		   Arrays.sort(array);
		int mid = (left + right) / 2;
		if (left > right) {
			return -1;
		} else {
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				return recuriveBinarySearch(target, left, mid - 1);
			} else {
				return recuriveBinarySearch(target, mid + 1, right);
			}
		}

	}

	public int recuriveBinarySearch1(int target) {
		return recuriveBinarySearch(target, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int[] array = { 12, 10, 9, 45, 45, 2, 10, 45 };
		Task_1 task_1 = new Task_1(array);
		int re = task_1.interaveLinearSearch(45);
		System.out.println(re);
		int re1 = task_1.recursiveLinearSearch1(45);
		System.out.println(re1);

		int[] array1 = { 5,23,5,23,1,8,19 };
		task_1 = new Task_1(array1);
		int re2 = task_1.iterrativeBinarySearch(23);
		System.out.println(re2);
		int re3 = task_1.recuriveBinarySearch1(23);
		System.out.println(re3);
	}
}
