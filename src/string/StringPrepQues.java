package string;

import java.util.Scanner;

/**
 * 1. The program will recieve 3 English words inputs from STDIN
 * 
 * These three words will be read one at a time, in three separate line The
 * first word should be changed like all vowels should be replaced by % The
 * second word should be changed like all consonants should be replaced by # The
 * third word should be changed like all char should be converted to upper case
 * Then concatenate the three words and print them Other than these concatenated
 * word, no other characters/string should or message should be written to
 * STDOUT
 * 
 * For example if you print how are you then output should be h%wa#eYOU.
 * 
 * You can assume that input of each word will not exceed more than 5 chars
 * 
 * @author hp
 *
 */
public class StringPrepQues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word1 = scan.next();
		String word2 = scan.next();
		String word3 = scan.next();

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		word3 = word3.toUpperCase();

		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == 'a' || word1.charAt(i) == 'e' || word1.charAt(i) == 'i' || word1.charAt(i) == 'o'
					|| word1.charAt(i) == 'u') {
				
				word1=word1.replace(word1.charAt(i), '%');
			}
		}
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i) != 'a' && word2.charAt(i) != 'e' && word2.charAt(i) != 'i' && word2.charAt(i) != 'o'
					&& word2.charAt(i) != 'u') {

				word2=word2.replace(word2.charAt(i), '#');
			}
		}

		System.out.println(word1 + word2 + word3);
	}

}
