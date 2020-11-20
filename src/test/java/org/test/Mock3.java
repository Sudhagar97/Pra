package org.test;

import java.util.Arrays;

public class Mock3 {
	private void anagramString(String str1, String str2) {
		
		String s1= str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if (s1.length()!=s2.length()) {
			status=false;
		}
		else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
	  if (status) {
		  System.out.println(s1+" and "+s2+" are Anagrams");
	}else {
		System.out.println(s1+" and "+s2+" are not Anagrams");
	}

	}
	public static void main(String[] args) {
		Mock3 m= new Mock3();
		m.anagramString("peek", "keep");
		m.anagramString("parrot", "raptor");
		m.anagramString("race", "cows");
	}

}
