package Lab4;

public class OrderItem {
	private Product p;
	private int quantity;
	public OrderItem(Product p, int quantity) {
		super();
		this.p = p;
		this.quantity = quantity;
	}
	
	public Product getP() {
		return p;
	}

	public int getQuantity() {
		return quantity;
	}

	
	@Override
	public String toString() {
		return "OrderItem:" + p.toString() + ", quantity:" + quantity + "\n";
	}
	

}
