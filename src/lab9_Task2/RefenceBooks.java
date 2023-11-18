package lab9_Task2;

import java.util.List;

public class RefenceBooks extends Publications{
     private String field;
     private  List<Chaper> chapers;
	
	public RefenceBooks(String tittle, int numberPage, int year, String author, double price, String field,
			List<Chaper> chapers) {
		super(tittle, numberPage, year, author, price);
		this.field = field;
		this.chapers = chapers;
	}
	public String getField() {
		return field;
	}
	public List<Chaper> getChapers() {
		return chapers;
	}
	@Override
	public String getPublicationType() {
		// TODO Auto-generated method stub
		return "RefenceBooks";
	}
	@Override
	public boolean isMagazine() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String toString() {
		String tr=super.toString();
		tr+="RefenceBooks [field=" + field + ", chapers=" + chapers ;
		return tr;
	}
	
	

     
     
}

