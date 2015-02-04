package cse.manoj.two;

//Problem        : Most Valuable Palindrome
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_65
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Your submission should *ONLY* use the following class name
public class Problem {
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		// while(stdin.hasNextLine())
		// {
		// System.out.println(stdin.nextLine());
		// }

		String input = stdin.nextLine();

		stdin.close();

		if (input.length() >= 2) {

			Set<CharSequence> out = new HashSet<CharSequence>();
			int length = input.length();
			for (int i = 1; i < length - 1; i++) {
				for (int j = i - 1, k = i + 1; j >= 0 && k < length; j--, k++) {
					if (input.charAt(j) == input.charAt(k)) {
						out.add(input.subSequence(j, k + 1));
					} else {
						break;
					}
				}
			}

			ArrayList<Integer> values = new ArrayList<Integer>();
			int i = 0;
			for (CharSequence c : out) {
				values.add(value(c));

			}
//			 System.out.println(values);
//			System.out.println(out);
			try {

				Collections.sort(values); // Sort the arraylist
				values.get(values.size() - 1); // gets the last item, largest
												// for an ascending sort

				System.out.println(values.get(values.size() - 1));

			} catch (Exception e) {
				System.out.println("0");

				// TODO: handle exception
			}

		}

		if (input.length() < 2) {

			System.out.println("0");
		}

	}

	public static int value(CharSequence c2) {
		// TODO Auto-generated method stub

		int sum = 0;
		char[] ch = ((String) c2).toCharArray();
		for (char c : ch) {
			int temp = (int) c;
			int temp_integer = 64; // for upper case
			if (temp <= 90 & temp >= 65)
				sum = sum + temp - temp_integer;
		}

		return sum;
	}

}