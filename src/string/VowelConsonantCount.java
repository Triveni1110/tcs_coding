package string;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String test = " This is my first String Program in which aims to count the number of character ";
		test.toLowerCase();
		int total = 0;
		int vcount = 0;
		int ccount = 0;
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) != ' ') {
				if (test.charAt(i) != 'a' && test.charAt(i) != 'e' && test.charAt(i) != 'i' && test.charAt(i) != 'o'
						&& test.charAt(i) != 'u') {
					ccount++;
				} else {
					vcount++;
				}
				total++;
			}
		}
		System.out.println("Totalare : " + total);
		System.out.println("Vowel are : " + vcount);
		System.out.println("Consonants are : " + ccount);
	}

}
