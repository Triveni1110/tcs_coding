package array;

public class EvenOddFrequency {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5 }, { 1, 1, 3, 4, 5 }, { 1, 2, 1, 4, 5 }, { 1, 2, 3, 1, 5 }, { 1, 2, 3, 4, 1 } };

		int evenFreq = 0;
		int oddFreq = 0;

		System.out.println("Even odd frequency ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] % 2 == 0) {
					evenFreq++;
					System.out.print(" even:::" + a[i][j]);
				} else {
					oddFreq++;
					System.out.print(" odd::" + a[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("even frequency:::" + evenFreq);
		System.out.println("odd frequency:::" + oddFreq);
	}

}
