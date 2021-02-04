package string;

/**
 * The String of length n will be having (n*(n-1) )/2 subset.
 * 
 * @author hp
 *
 */
public class StringSubset {

	public static void main(String[] args) {

		String test = "abcdefg";
		int length = test.length();
		int subsetElements = (int) (length * (length + 1)) / 2;
		String[] testSubSet = new String[subsetElements];
		System.out.println("length of string:"+length+"length of subset"+testSubSet.length);
		int temp = 0;
		for (int i = 0; i < test.length(); i++) {
			for (int j = i+1; j <= test.length(); j++) {
				testSubSet[temp] = test.substring(i, j);
				temp++;
			}
		}
		for (int i = 0; i < testSubSet.length; i++) {
			System.out.println(" " + testSubSet[i] );
		}

	}

}
