/**
 * 
 */
package string;

/**
 * @author hp
 *
 */
public class IfRotateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String orString = "You want to know if i m rotable or not isn't ?";

		String rev = orString + orString;

		String test = "know if i m rotable or not isn't ? You want to ";

		if (rev.contains(test)) {
			System.out.println("Its rotatable");
		} else {
			System.out.println("Its not");
		}

	}

}
