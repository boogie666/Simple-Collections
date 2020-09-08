package collections;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import collections.prefixtrie.PrefixTrie;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		PrefixTrie p = new PrefixTrie();
		Scanner s = new Scanner(new FileInputStream(new File("words.txt")));
//		int count = 0;
//		while(s.hasNext()) {
//			String line = s.nextLine();
//			String word = line.split(" ")[1];
//			p.insert(word);
//			count ++;
//		}
		p.insert("hello");
		p.insert("help");
		p.insert("helper");
		List<String> results = p.query("help");
		
//		System.out.println("Total words: " + count);
		System.out.println(results);
	}

	

}
