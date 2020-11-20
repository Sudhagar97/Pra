package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Mock5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String sentence = sc.nextLine();
		
		String[] tokens = sentence.split(" ");
		
		for (String token : tokens) {
			
			String word = token.toLowerCase();
			if (map.containsKey(word)) {
				Integer count = map.get(word);
				map.put(word, count + 1);
			}else {
				map.put(word, 1);
			}
			
		}
		//"word = " +
		Set<String> keys = map.keySet();
		TreeSet<String> sortekeys = new TreeSet<String>(keys);
		for (String str : sortekeys) {
			System.out.println( str + " count = " + map.get(str));
		}
	}

}
