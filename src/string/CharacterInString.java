package string;

public class CharacterInString {

	public static void main(String[] args) {
		String test = new String("We will be replacing the space in string with a character.");
		test = test.replace('a', '%');

		System.out.println(test);

		String test2 = "Lets go to the moon";
		test2 = test2.replace(" ", "-");

		String[] part = test2.split("-");
		System.out.println(test2);
		for (int i = 0; i < part.length; i++) {
			System.out.println(part[i]);
		}
	}

}
