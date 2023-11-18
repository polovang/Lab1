package lab9_Task2;

public class Magazine extends Publications{
	private String name;

	public Magazine(String tittle, int numberPage, int year, String author, double price, String name) {
		super(tittle, numberPage, year, author, price);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		return "Magazine";
	}

	@Override
	public boolean isMagazine() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String toString() {
		 String str = super.toString();
		    
		    // Thêm thông tin riêng của ấn phẩm Magazine
		    str += ", Name:" + name;
		    
		    return str;
	}
	
	

}
