package string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String test = "This program aims at removal of whitespace from string.";
		char[] clone = new char[test.length()];
		int j = 0;
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) != ' ') {
				clone[j] = test.charAt(i);
				j++;
			}

		}
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i]);
		}

		//Using replace or replaceAll() method we can easily remove the all whitespace.
		System.out.print(test.replace(" ", ""));

	}

}
