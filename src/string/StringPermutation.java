package string;

import java.util.Scanner;

/**
 * Permutation of a string:
 * 
 * @author hp
 *
 */
public class StringPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String test = "abc";
		printPermutation(test, " ");

	}

	private static void printPermutation(String test, String ans) {
		if (test.length() == 0) {
			System.out.println(ans+" ");
		}
		for (int i = 0; i < test.length(); i++) {
			char c=test.charAt(i);
			
			String ros=test.substring(0,i)+test.substring(i+1);
			printPermutation(ros, ans+c);
		}
	}

}
