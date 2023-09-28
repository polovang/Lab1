package lab_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2345 {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public Task_2345(int n) {
		this.n = n;
	}
    //Task_2 Encrypt a character according to the given shif steps.
	// Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
 
	public char encryptChar(char c) {
		int a = -2;
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c) {
				a = i;
				break;
			}
		}
		if (a != -2) {
			int b = (a + n) % 26;
		

			return ALPHABET[b];
		} else {
			return c;
		}
	}
//Task_2  Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			char b = encryptChar(a);
			builder.append(b);
		}
		return builder.toString();

	}
	//Task_2 Decrypt a character according to the given shif steps.
	// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET array
	public char decryptChar(char c) {
		int a = -2;
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == c) {
				a = i;
				break;
			}
		}
		if (a != -2) {
			int b = (a -n) % 26;
		if(b<0)

				b = b + 26;
			return ALPHABET[b];
		} else {
			return c;
		}
	}
	//Task_2 Decrypt a encrypted text using the above function for decrypting a charater.
	public String decrypt(String input) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			char b = decryptChar(a);
			builder.append(b);
		}
		return builder.toString();
	}
	
	//Task_3 Expanding the problem in Task 3 so that the program can encrypt and decrypt a given text including numbers and characters.
    public String encryptText(String input) {
          StringBuilder builder = new StringBuilder();
  		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			char b = encryptChar(a);
			builder.append(b);
  		}
  		return builder.toString();
    
    }
	//task_5 Encrypt and Decrypt the text content in the srcfile and save it into desFile.
	public void encrypt(String srcFile, String desFile) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(srcFile));
	         BufferedWriter writer = new BufferedWriter(new FileWriter(desFile))) {

	        String line;
	        while ((line = reader.readLine()) != null) {
	            String encryptedLine = encrypt(line);
	            writer.write(encryptedLine);
	            writer.newLine();

	       
	            System.out.println("Encrypted line: " + encryptedLine);
	        }
	        System.out.println("Encryption completed. Encrypted data saved in " + desFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	public void decrypt(String srcFile, String desFile) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(srcFile));
	         BufferedWriter writer = new BufferedWriter(new FileWriter(desFile))) {

	        String line;
	        while ((line = reader.readLine()) != null) {
	            String decryptedLine = decrypt(line);
	            writer.write(decryptedLine);
	            writer.newLine();

	       
	            System.out.println("Decrypted line: " + decryptedLine);
	        }
	        System.out.println("Decryption completed. Decrypted data saved in " + desFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
        //Test Task_2
		Task_2345 task_2 = new Task_2345(2);
		char output = task_2.encryptChar('B');
		System.out.println(output);

		System.out.println("---");
		Task_2345 task_22 = new Task_2345(3);
		String ouput1 = task_22.decrypt("VANG");
		System.out.println(ouput1);
		
		System.out.println("---");
		Task_2345 task_3 = new Task_2345(2);
		char output2 = task_3.decryptChar('B');
		System.out.println(output2);

		System.out.println("---");
		Task_2345 task_4 = new Task_2345(3);
		String ouput4 = task_4.encrypt("VANG");
		System.out.println(ouput4);
		
		//Test Task_3
		System.out.println("---");
		Task_2345 task_5 = new Task_2345(4);
		String ouput5 = task_5.encrypt("NGUYEN56");
		System.out.println(ouput5);
		
		//Test Task_5
		System.out.println("---");
		Task_2345 task_23 = new Task_2345(4);
		String srcFile ="folder/test1.txt";
		String desFile ="folder/test2.txt";
		task_23.encrypt(srcFile, desFile);
		
		System.out.println("---");
		Task_2345 task_24 = new Task_2345(4);
		String srcFile1 ="folder/test1.txt";
		String desFile1 ="folder/test2.txt";
		task_24.decrypt(srcFile1, desFile1);
		
	}

}
