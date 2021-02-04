package dataStructures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Sweet Seventeen Problem Description Given a maximum of four digits to the
 * base 17(10 -> A, 11-> B,12 -> C, 16 -> G) as input, output its decimal value
 * 
 * Input 1 1A Expected output 27 Input 2 23 GF Expected output 10980
 * 
 * 
 * 
 * @author hp
 *
 */
public class SweetSeventeen {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int base = 17;
		int dnum = 0;

		System.out.println("The number in decimal form is: ");

		HashMap<Character, Integer> decode = new HashMap<>();
		decode.put('A', 10);
		decode.put('B', 11);
		decode.put('C', 12);
		decode.put('D', 13);
		decode.put('E', 14);
		decode.put('F', 15);
		decode.put('G', 16);
		decode.put('a', 10);
		decode.put('b', 11);
		decode.put('c', 12);
		decode.put('d', 13);
		decode.put('e', 14);
		decode.put('f', 15);
		decode.put('g', 16);

		int pow = 0;
		for (int i = num.length() - 1; i > 0; i--) {
			if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z' || num.charAt(i) >= 'a' && num.charAt(i) <= 'z') {
				System.out.println(num.charAt(i));
				dnum = dnum + decode.get(num.charAt(i)) * ((int) (Math.pow(base, pow)));
			} else {
				System.out.println(num.charAt(i));
				dnum = dnum + (int) num.charAt(i) * ((int) Math.pow(base, pow));
			}
			pow++;
		}

		System.out.println("The corresponding number is:" + dnum);
	}

}
