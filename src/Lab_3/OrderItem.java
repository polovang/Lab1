package Lab_3;

public class OrderItem {
	private Product p;
	private int quantity;
	public OrderItem(Product p, int quantity) {
		super();
		this.p = p;
		this.quantity = quantity;
	}
	public double getItemCost() {
		return p.getPrice()*quantity;
	}
	@Override
	public String toString() {
		return "OrderItem:" + p + ", quantity:" + quantity + "\n";
	}
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
