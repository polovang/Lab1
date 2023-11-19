package lab9_Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Categoty {
	private List<Publications> list;

	public Categoty(List<Publications> list) {
		super();
		this.list = list;
	}

	public Categoty() {
		list = new ArrayList<Publications>();
	}

	public void add(Publications publications) {
		list.add(publications);
	}

	public double getTotal() {
		double total = 0.0;
		for (Publications liPublications : list) {
			total += liPublications.getPrice();
		}
		return total;
	}

	public Publications findChaper() {
		RefenceBooks books = null;
		int maxCheck = 0;
		for (Publications liPublications : list) {
			if (liPublications instanceof RefenceBooks) {
				RefenceBooks refenceBooks = (RefenceBooks) liPublications;
				if (refenceBooks.getNumberPage() > maxCheck) {
					maxCheck = refenceBooks.getNumberPage();
					books = refenceBooks;
				}

			}
		}
		return books;
	}

	public boolean checkMagazineAsNameMagazineOther(String name) {
		for (Publications publications : list) {
			if (publications instanceof Magazine) {
				Magazine magazine = (Magazine) publications;
				if (magazine.getName().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	public List<Magazine> asYear(int year) {
		List<Magazine> listMagazine = new ArrayList<>();
		for (Publications publications : list) {
			if (publications instanceof Magazine) {
				Magazine magazine = (Magazine) publications;
				if (magazine.getYear() == year) {
					listMagazine.add(magazine);
				}
			}
		}
		return listMagazine;
	}

	public void sortPublication() {
		Collections.sort(list, new Comparator<Publications>() {

			@Override
			public int compare(Publications o1, Publications o2) {
				int check = o1.getTittle().compareTo(o2.getTittle());
				if (check == 0) {
					return Integer.compare(o2.getYear(), o1.getYear());
				} else {
					return o1.getTittle().compareTo(o2.getTittle());
				}
			}
		});
		for (Publications liPublications : list) {
			
			System.out.println(liPublications.toString());
		}
	}

	public Map<Integer, Integer> quanlitPublication() {
		Map<Integer, Integer> map = new TreeMap<>();
		for (Publications liPublications : list) {
			int year = liPublications.getYear();
			map.put(year, map.getOrDefault(year, 0) + 1);
		}
		return map;
	}

}

	
