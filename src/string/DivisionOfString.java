package string;

import java.util.Scanner;

/**
 * Division of strings in n equal parts.
 * 
 * The string can be divided into n equal part only if the length of the string
 * is completely divisible by n
 * 
 * but if the length of string is not divisible then the string can't divided in
 * equal length.
 * 
 * @author hp
 *
 */
public class DivisionOfString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String test = "abcdefghijklmnopqrstuvwxyz";

		int n = scan.nextInt();
		int totalLength = test.length();

		if (totalLength % n != 0) {
			System.out.println("The given string can not divide into : " + n + "parts");
		} else {
			int newSize = totalLength / n;
			String[] testParts = new String[newSize];
			System.out.println("the new array of test string parts is :" + newSize);
			int i = 0, j = 0;
			while (i < test.length()) {
				testParts[j] = test.substring(i, i + n );
				j++;
				i = i + n;
			}
			for (int j2 = 0; j2 < testParts.length; j2++) {

				System.out.println(testParts[j2]);
			}
		}

	}

}
