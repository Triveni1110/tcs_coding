package array;

/**
 * 
 * Matrix in java referes to the two -d array .
 * 
 * we can perform many operations on matrix such as: 1.Sum of two matrix
 * 2.Difference of two matrix 3.Product of two matrix. 4.To determine whether
 * two matrices are equal. 5.To display the lower triangular matrix. 6.To
 * display the upper triangular matrix. 7.To find the sum of two matrix. 8.To
 * find the difference of two rows or diagonal columns of a amtrix.
 * 
 * 
 * @author hp
 *
 */
public class Matrix {

	public static void main(String args[]) {
		int a[][] = { { 2, 3, 3 }, { 3, 4, 5 }, { 4, 5, 6 } };
		int b[][] = { { 2, 3, 3 }, { 3, 4, 5 }, { 4, 5, 6 } };

		System.out.println("Addition of the two matrix");
		int sum[][] = new int[a.length][a.length];

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}

		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				System.out.print(" " + sum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of two matrices");
		int mul[][] = new int[a.length][a.length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				mul[i][j] = 0;
				for (int k = 0; k < sum.length; k++) {

					mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
				}
			}

		}

		for (int i = 0; i < mul.length; i++) {
			for (int j = 0; j < mul.length; j++) {
				System.out.print(" " + mul[i][j] + " ");
			}
			System.out.println();
		}

		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					flag = false;
					break;
				}
			}

		}
		System.out.println("To check if the two matrices are equal");
		if (flag) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

		System.out.println("To print the lower triangular matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + a[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("To print the upper triangular matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i > j) {
					System.out.print(" ");
				} else
					System.out.print(a[i][j]);

			}
			System.out.println();
		}

		System.out.println("To print the sum of each row and each column");
		int rowSum[] = new int[a.length];
		int colSum[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sumR = 0;
			int sumC = 0;
			for (int j = 0; j < a[i].length; j++) {
				sumR = sumR + a[i][j];
				sumC = sumC + a[j][i];
			}
			rowSum[i] = sumR;
			colSum[i] = sumC;
		}

		for (int i = 0; i < rowSum.length; i++) {

			System.out.println("sum of row " + i + " " + rowSum[i]);
			System.out.println("sum of col " + i + " " + colSum[i]);
		}

	}

}
