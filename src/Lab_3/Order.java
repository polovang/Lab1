package Lab_3;

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
	    	return false;
	    }
	    public Product[] filter(String type) {
	    	return null;
	    }
	
	}

