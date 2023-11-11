package lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyWordCountApp {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";
	// <word, its occurences>
	private Map<String, Integer> map = new HashMap<String, Integer>();

	// Load data from fileName into the above map (containing <word, its
	// occurences>)
	// using the guide given in TestReadFile.java
	public void loadData() {
		try {
			Scanner input = new Scanner(new File(fileName));
			while (input.hasNext()) {
				String word = input.next();
				map.put(word, map.getOrDefault(word, 0) + 1);

			}
			System.out.println(map);

		} catch (FileNotFoundException e) {
			System.out.println("Not successfull");
		}
	}

	// Returns the number of unique tokens in the file data/hamlet.txt or fit.txt
	public int countUnique() {
		return map.size();

	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public void printWordCounts() throws FileNotFoundException {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());

		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according to ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public void printWordCountsAlphabet() {
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int check = o1.getValue().compareTo(o2.getValue());
				if (check == 0) {
					return o1.getKey().compareTo(o2.getKey());
				} else {
					return o1.getValue().compareTo(o2.getValue());
				}
			}
		});
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		MyWordCountApp app = new MyWordCountApp();
		app.loadData();
		System.out.println(app.countUnique());
		try {
			app.printWordCounts();
		} catch (FileNotFoundException e) {
			System.out.println("Not");
		}
		System.out.println();
		app.printWordCountsAlphabet();

	}
}
