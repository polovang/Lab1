package lab8;

public class TestAnaly {
	public static void main(String[] args) {
		TextAnalyzer analyzer = new TextAnalyzer();
		analyzer.load("data/short.txt");
		System.out.println(" ");
		analyzer.add("Nguyen", 13);
		System.out.println(" ");
		analyzer.displayWords();
		System.out.println(" ");
		analyzer.displayText();
		System.out.println(analyzer.countAllWords());
		System.out.println("Most frequent word: "+analyzer.mostFrequentWord());
	}

}
