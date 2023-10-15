package Lab4;

import java.sql.Array;
import java.util.Arrays;

public class OrderTest {
	public static void main(String[] args) {
		Product p1 = new Product("123", "A", 10.0, "Bit");
		Product p2 = new Product("124", "T", 8.0, "Dong thung");
		Product p3 = new Product("125", "N", 5.0, "Dong thung");
		Product p4 = new Product("125", "Nuoc", 6.6, "Dong thung");
		OrderItem item1 = new OrderItem(p1, 3);
		OrderItem item2 = new OrderItem(p2, 4);
		OrderItem item3 = new OrderItem(p3, 5);

		OrderItem[] items = { item1, item2, item3 };
		Order order = new Order(items);
		
        order.bubbleSort();
       System.out.println(order.toString());
       System.out.println("---");
       order.seclectionSort();
       System.out.println(order.toString());
       System.out.println("---");
       order.intertionSort();
       System.out.println(order.toString());
    }
	
	

}
