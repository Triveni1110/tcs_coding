package string;

import java.util.Arrays;

public class Pallindrome {

	public static void main(String[] args) {
		String test = "abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba";
		String test2 = "can we have a cup of cofee?";

		// we can visit the string and then reverse the string by forming it into new
		// array of char and then comparing.
	

		isPallindrome(test);
		isPallindrome(test2);

	}

	private static void isPallindrome(String t) {
		char[] ot = t.toCharArray();
		char[] rev_t = new char[ot.length];
		int j = 0;
		for (int i = ot.length - 1; i >= 0; i--) {
			rev_t[j] = ot[i];
			j++;
		}

		if (Arrays.equals(rev_t, ot)) {
			System.out.println(ot);
			System.out.println(rev_t);
			System.out.println("The given string is pallindrome");
		} else {
			System.out.println(ot);
			System.out.println(rev_t);
			System.out.println("Not a pallindrome.");
		}
	}

}
