package Lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	// BubbleSort ascending with name
	public void bubbleSort() {
		int n = items.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (items[j].getP().getName().compareTo(items[j + 1].getP().getName()) > 0) {
					OrderItem temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;

				}
			}
		}

	}

	// SelectionSort ascending with name
	public void seclectionSort() {
		int n = items.length;
		for (int i = 0; i < n - 1; i++) {
			int check = i;
			for (int j = i + 1; j < n; j++) {
				if (items[check].getP().getName().compareTo(items[j].getP().getName()) > 0) {
					check = j;

				}
			}
			OrderItem temp = items[check];
			items[check] = items[i];
			items[i] = temp;
		}
	}

	// IntertionSort ascending with name
	public void intertionSort() {
		int n = items.length;
		for (int i = 1; i < n; i++) {
			OrderItem check = items[i];
			int re = i - 1;
			while (re >= 0 && check.getP().getName().compareTo(items[re].getP().getName()) < 0) {
				check = items[re];
				re--;
			}
			items[re + 1] = check;
		}
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (OrderItem item : items) {
			builder.append(item).toString();
		}
		return builder.toString();
	}

}
