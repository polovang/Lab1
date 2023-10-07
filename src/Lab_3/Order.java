package Lab_3;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	public double cost() {
		double totalCost = 0.0;
		for (OrderItem item : items) {
			totalCost += item.getItemCost();
		}
		return totalCost;
	}

	public boolean contains(Product p) {
		Arrays.sort(items, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {

				return o1.getProduct().getId().compareTo(o2.getProduct().getId());

			}
		});
		int left = 0;
		int right = items.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int re = items[mid].getProduct().getId().compareTo(p.getId());
			if (re == 0) {
				return true;
			} else if (re < 0) {
				mid = left + 1;
			} else {
				mid = right - 1;
			}
		}
		return false;
	}

	public Product[] filter(String type) {
		return null;
	}

}
