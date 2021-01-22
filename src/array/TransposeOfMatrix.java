package array;

/**
 * Transpose of a matrix is formed by interchanging the rows and columns of an
 * array.
 * 
 * @author hp
 *
 */
public class TransposeOfMatrix {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

		int transA[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				transA[i][j] = a[j][i];
			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Transpose::");
		for (int i = 0; i < transA.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + transA[i][j]);
			}
			System.out.println();
		}
	}

}
