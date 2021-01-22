package string;

import java.util.Arrays;

/**
 * To find out which character is min or max time occuring we have to caluculate
 * the frequency of each distinct character.
 * 
 * so we will maintain the String as char array and will skip the duplicate by
 * replacing while traversing by -1.
 * 
 * 
 * 
 * @author hp
 *
 */
public class MinMaxCharacter {

	public static void main(String[] args) {

//		String test = "This is my string i which i will be counting the min and max occuring character .";
		String test = "grass is greener on the other side";
		test = test.toLowerCase().replace(" ", "");
		char[] testChar = test.toCharArray();
		Arrays.sort(testChar);
		System.out.println(testChar);
		System.out.println("");
		char[] duplicateElements = new char[testChar.length];

		int maxFrequency = 1;
		char maxChar = '0';
		int minFrequency = 1;
		char minChar = '0';
		int k = 0;
		for (int i = 0; i < testChar.length; i++) {

			if (testChar[i] != '*') {
				int count = 1;
				for (int j = i + 1; j < testChar.length; j++) {
					if (testChar[i] == testChar[j]) {
						duplicateElements[k] = testChar[j];

						testChar[j] = '*';
						count++;

						k++;
					}
				}
				if (count > maxFrequency) {
					maxFrequency = count;
					maxChar = testChar[i];
				} else if (count <= minFrequency) {
					minFrequency = count;
					minChar = testChar[i];
				}
				System.out.println("The character " + testChar[i] + " occurs : " + count + "times. ");
			}

		}

		System.out.println("The min occur char is :" + minChar + " occurs " + minFrequency);
		System.out.println("The max occur char is :" + maxChar + " occurs " + maxFrequency);

		for (int i = 0; i < duplicateElements.length; i++) {
			System.out.println(duplicateElements[i]);
		}
	}

}
