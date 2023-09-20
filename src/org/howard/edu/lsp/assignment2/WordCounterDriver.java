package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;

public class WordCounterDriver {

	public static void main(String[] args) {
		FileReader fr = new FileReader();
		WordCounter word_counter = new WordCounter();
		try {
			word_counter.count_words();
			System.out.println(fr.readToString("words.txt"));
			for (String word : word_counter.dictionary.keySet()) {
				System.out.println(word + " " + word_counter.dictionary.get(word));
			}
		} catch (FileNotFoundException e){
			System.out.println(e.toString());
		}

	}

}
