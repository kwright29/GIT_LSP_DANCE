package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.io.FileNotFoundException;

public class WordCounter {
	HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
	
	public WordCounter() {
		this.dictionary = dictionary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCounter myCounter = new WordCounter();
		myCounter.count_words();
			
		
	}
	public void count_words() {
		FileReader file_reader = new FileReader();
		try {
			String contents = file_reader.readToString("words.txt");
			String[] words = contents.toLowerCase().split(" ");
			String digits = "0123456789";
			//making sure we don't count digits
			for (int j = 0; j < words.length; j++) {
				String word = words[j];
				for (int idx = 0; idx < word.length(); idx ++) {
					if (digits.indexOf(word.charAt(idx)) != -1)  {  // if digit is found in string...
						words[j] = "";
					}
				}
				
			}
			for (int i = 0; i < words.length; i++) {
				
				if (words[i].equals("")) {
					continue;
				}
				
				if (words[i].length() > 3) {
					if (this.dictionary.get(words[i]) == null) {
						this.dictionary.put(words[i], 1);
					} else {
						this.dictionary.put(words[i], this.dictionary.get(words[i]) + 1);
					}
				}
			
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found in directory.");
		}
	}

}
