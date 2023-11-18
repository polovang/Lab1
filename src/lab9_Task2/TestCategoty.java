package lab9_Task2;

import java.util.ArrayList;
import java.util.List;

public class TestCategoty {
	public static void main(String[] args) {
		Chaper c1 = new Chaper("Toan", "1");
		Chaper c2 = new Chaper("Van", "2");
		Chaper c3 = new Chaper("Anh", "3");
		List<Chaper>chaper= new ArrayList<>();
		List<Chaper>chaper1= new ArrayList<>();
		List<Chaper>chaper2= new ArrayList<>();
		chaper.add(c1);
		chaper.add(c2);
		chaper.add(c3);
		chaper1.add(c1);
		chaper1.add(c2);
		chaper2.add(c3);
		chaper2.add(c2);
		
		
		Publications book1= new RefenceBooks("Niem  TIn", 3, 1999, "D", 12.3, "Y Hoc", chaper);
		Publications book2= new RefenceBooks("Tin Tuong", 5, 2001, "F", 23.3, "The Thao", chaper1);
		Publications book3= new RefenceBooks("Binh Yen", 8, 2006, "A", 42.3, "Giao Duc", chaper2);
		
		Publications m1 = new Magazine("Tuoi Tre", 10, 2004, "N", 10.0, "Canh Tinh");
		Publications m2 = new Magazine("Thanh Nien", 16, 2000, "T", 14.0, "Te Nan");
		Publications m3 = new Magazine("Suc Khoe", 30, 1998, "S", 20.0, "Tim Mach");
		
		List<Publications> list1 = new ArrayList<>();
		list1.add(book1);
		list1.add(m2);
		list1.add(m3);
		List<Publications> list2 = new ArrayList<>();
		list2.add(book2);
		list2.add(book3);
		list2.add(m1);
		
		Categoty categoty1 = new Categoty(list1);
		Categoty categoty2 = new Categoty(list2);
		
		
		
		System.out.println(categoty1.getTotal()+categoty2.getTotal());
	    System.out.println(categoty1.findChaper());
		System.out.println(categoty1.checkMagazineAsNameMagazineOther("N"));
		List<Magazine> result = categoty2.asYear(2004);
		System.out.println(result);
		System.out.println("Sort:");
		categoty2.sortPublication();
		System.out.println("Map:");
		System.out.println(categoty1.quanlitPublication());
	}

}
