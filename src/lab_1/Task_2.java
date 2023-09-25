package lab_1;

public class Task_2 {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O','P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
			private int n;// shift steps (right shift)
			public Task_2(int n) {
			this.n = n;
			}
			public char encryptChar(char c) {
				int a=-2;
				for(int i=0 ; i<ALPHABET.length; i++) {
					if(ALPHABET[i]==c) {
						a=i;
						break;
					}
				}
				if(a!=-2) {
					int b=(a-n)%26;
					if(b<0)
						b=b+26;
					return ALPHABET[b];
				}else {
					return c;
				}
			}
			public static void main(String[] args) {
				
				Task_2  task_2 = new Task_2(178);
				char output = task_2.encryptChar('B');
				System.out.println(output);
				
			}

}
