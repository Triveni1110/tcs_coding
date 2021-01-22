package string;

/**
 * There are many ways to count the character in the string .
 * 
 * 1. with string.length() but it include whitespaces too. 2. with for loop or
 * convetring into char[] arry.(it also count whitespace)
 * 
 * 
 * @author hp
 *
 */
public class TotalCharacter {

	public static void main(String[] args) {

		String test = " This is my first String Program in which i am going to count the number of character ";

		// Everything is a character but not the whitespace.

		System.out.println(test.length());
		int countChar = 0;

		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) != ' ') {
				countChar++;
				System.out.println(" " + test.charAt(i));
			}

		}
		System.out.println(countChar);
		char[] charArry = test.toCharArray();
		int sizecharArry = charArry.length;
		System.out.println(sizecharArry);

		for (int i = 0; i < sizecharArry; i++) {
			System.out.println(charArry[i]);
		}

		
		StringBuffer sb1=new StringBuffer(test);
		System.out.println(sb1.length());
	}

}
