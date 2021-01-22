package string;

import java.util.Arrays;

/**
 * The two string are anagram if and only if the they contain the same character with any sequence.
 * 
 * @author hp
 *
 */
public class CheckAnagram {

	public static void main(String[] args) {

		String test1 = new String("This is used to test the anagram");
		String test2 = new String("This is used to test the anagram");
		String test3 = new String("This is used to check the anagram");

		System.out.println(isAnagram(test1, test2));
		System.out.println(isAnagram(test1, test3));
	}

	private static boolean isAnagram(String test1, String test2) {
		
		char[] charTest1 = test1.toLowerCase().toCharArray();
		char[] charTest2 = test2.toLowerCase().toCharArray();

		Arrays.sort(charTest1);
		Arrays.sort(charTest2);
		
		for (int i = 0; i < charTest1.length; i++) {
			System.out.println(charTest1[i]+" "+charTest2[i]);
		}
		
		if (Arrays.equals(charTest1, charTest2) == true) {
			return true;
		}
		return false;
	}

}
