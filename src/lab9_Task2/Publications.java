package lab9_Task2;

public  abstract class Publications {
	private String tittle;
	private int numberPage;
	private int year;
	private String author;
	private double price;
	public Publications(String tittle, int numberPage, int year, String author, double price) {
		this.tittle = tittle;
		this.numberPage = numberPage;
		this.year = year;
		this.author = author;
		this.price = price;
	}
	public String getTittle() {
		return tittle;
	}
	public int getNumberPage() {
		return numberPage;
	}
	public int getYear() {
		return year;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public abstract String getPublicationType() ;
	public abstract boolean isMagazine() ;	
	
	 public boolean isPublishedInLast10Years() {
	        return isMagazine()&&(2021-getYear()==10);
	        
	    }
	 public boolean hasSameTypeAndAuthor(Publications other) {
		 return this.getPublicationType().equals(other.getPublicationType())&&this.author.equals(other.author);
	 }
	@Override
	public String toString() {
		return "tittle:" + tittle + ", numberPage:" + numberPage + ", year:" + year + ", author:" + author
				+ ", price:" + price ;
	}
	 
}
	
		
	
	
