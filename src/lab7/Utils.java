package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
	public static List<String> loadfile(String file) throws FileNotFoundException {
		List<String> list = new ArrayList<>();
		Scanner a = new Scanner(new File(file));
		while (a.hasNext()) {
			String st = a.next();
			list.add(st);
		}
		return list;
	}

}
