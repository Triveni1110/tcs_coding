package string;

/**
 * This programs aims to find out the duplicate words in the string
 * 
 * @author hp
 *
 */
public class DuplicateWords {

	public static void main(String[] args) {

		String test = "Hi, Don't be silly You are brave and You can be more powerful day by day so don't worry you will be fine";
//		String test = "you you you are are";
		test = test.toLowerCase();
		test = test.replaceAll(" ", "-");

		String[] part = new String[test.length()];
		part = test.split("-");

		String[] duplicateElement = new String[part.length];
		int d = 0;

		String[] uniqueElement = new String[part.length];
		int u = 0;

		for (int i = 0; i < part.length; i++) {
			if (!(part[i].equals("*"))) {
				int count = 1;
				for (int j = i + 1; j < part.length; j++) {
					if (part[i].equalsIgnoreCase(part[j])) {
						part[j] = "*";
						count++;

					}

				}

				if (count > 1) {
					duplicateElement[d] = part[i];
					d++;
				} else if (count == 1) {
					uniqueElement[u] = part[i];
					u++;
				}
			}
		}
		System.out.println("Duplicate words ::::::::::::::");

		for (int i = 0; i < duplicateElement.length; i++) {
			System.out.println(duplicateElement[i]);

		}
		System.out.println("Unique words :::::::::::::::::::");
		for (int i = 0; i < uniqueElement.length; i++) {
			System.out.println(uniqueElement[i]);

		}
	}

}
