package lab7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
	public static final String fileName = "file/fit.txt";
	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadfile(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int count(String word) {
		int count = 0;
		for (int i = 0; i < this.words.size(); i++) {
			if (this.words.get(i).equals(word)) {
				count++;
			}
		}
		return count;
	}

	public List<WordCount> getWordCounts() {
		List<WordCount> re = new ArrayList<WordCount>();
		for (String st : words) {
			WordCount wordcount = new WordCount(st, count(st));
			if (!re.contains(wordcount)) {
				re.add(wordcount);
			}

		}
		return re;
	}

	public Set<String> getUniquewords() {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < this.getWordCounts().size(); i++) {
			if (this.getWordCounts().get(i).getCount() == 1) {
				set.add(this.getWordCounts().get(i).getWord());
			}
		}
		return set;

	}

	public Set<String> getDistinctWords() {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < this.getWordCounts().size(); i++) {
			if (this.getWordCounts().get(i).getCount() == 2) {
				set.add(this.getWordCounts().get(i).getWord());
			}
		}
		return set;

	}

	public Set<WordCount> printWordCounts() {
		Set<WordCount> re = new TreeSet<WordCount>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				if (o1.getCount() - o2.getCount() == 0) {
					return o1.getWord().compareToIgnoreCase(o2.getWord());
				}
				return o1.getCount() - o2.getCount();
			}
		});
		for (String word : words) {
			WordCount wc = new WordCount(word, count(word));
			if (!re.contains(wc)) {
				re.add(wc);
			}
		}

		return re;

	}

	public Set<WordCount> exportWordCountsByOccurence() {
		Set<WordCount> re = new TreeSet<WordCount>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				if (o1.getCount() - o2.getCount() == 0) {
					return o2.getWord().compareToIgnoreCase(o1.getWord());

				}
				return o2.getCount() - o1.getCount();
			}

		});
		for (String word : words) {
			WordCount count = new WordCount(word, count(word));
			if (!re.contains(count)) {
				re.add(count);
			}

		}
		return re;
	}
	public Set<String> filterWords(String pattern) {
		Set<String> result = new HashSet<String>();
		for (String word : words) {
			if (!word.startsWith(pattern)) {
				result.add(word);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		MyWordCount count = new MyWordCount();
		List<WordCount> counts = count.getWordCounts();
		System.out.println(counts);
		Set<String> set = count.getUniquewords();
		System.out.println(set);
		Set<String> set1 = count.getDistinctWords();
		System.out.println(set1);
		Set<WordCount> set2 = count.printWordCounts();
		System.out.println(set2);
		Set<WordCount> set3 = count.exportWordCountsByOccurence();
		System.out.println(set3);
		Set<String> set4 = count.filterWords("L");
		System.out.println(set4);

	}
}
