package cse.manoj.one;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String word = "cinema";
		String anagram = "iceman";
		System.out.println(isAnagram(word, anagram));

		char[] ar1 = word.toCharArray();
		char[] ar2 = anagram.toCharArray();
		
		Arrays.sort(ar1);Arrays.sort(ar2);
		boolean flag = false;
		for (int i = 0; i < ar2.length; i++) {
			if(ar1[i] != ar2[i])
				flag = true;
		}
		System.out.println(!flag);
	}
	
	
	public static boolean isAnagram(String word, String anagram) {
	    if (word.length() != anagram.length()) {
	        return false;
	    }  
	    char[] chars = word.toCharArray();
	    //loop through each character in `word`
	    for (char c: chars) {
	      int index = anagram.indexOf(c);
	        //if it exists in `anagram`, remove it using a combination of `substring` calls, else return false
	        if (index != -1) {
	          anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
	        } else {
	            return false;
	        }
	    }
	    return anagram.isEmpty();
	}
	
	
}
