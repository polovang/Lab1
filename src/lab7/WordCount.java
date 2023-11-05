package lab7;

public class WordCount {
	private String word;
	private int count;

	public WordCount(String word, int count) {
		this.word = word;
		this.count = count;
	}


	public int hashcode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + word.hashCode();
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// System.out.println("called");
		if (obj == null || getClass() != obj) {
			return false;
		} else {
			WordCount w = (WordCount) obj;
			return this.word.equals(w.word);
		}

	}
	

	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {

		return this.word + " " + this.count;
	}
}
