package Lab_4;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Product :" + id + ", name:" + name + ", price:" + price + ", type:" + type ;
	}
	
	
	
}
	
