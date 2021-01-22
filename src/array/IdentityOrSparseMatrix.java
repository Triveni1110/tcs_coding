package array;

/**
 * Identity matrix??
 * 
 * The matrix is said to be the identity matrix if and only if all the diagonal
 * elements are 1.
 * 
 * condition 1: It should be the sqaure matrix condition 2: If the diagonal
 * elements are 1 and rest are 0.
 * 
 * 
 * 
 * 
 * Sparse Matrix???
 * 
 * The matrix is said to be sparse matrix if it contain more number of element
 * (0) .(atleast 1+n/2) then it is said to be sparse matrix.
 * 
 * @author hp
 *
 */
public class IdentityOrSparseMatrix {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5 }, { 1, 1, 3, 4, 5 }, { 1, 2, 1, 4, 5 }, { 1, 2, 3, 1, 5 }, { 1, 2, 3, 4, 1 } };
		int iden[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		System.out.println(isIdentityMatrix(a));
		System.out.println(isIdentityMatrix(iden));
		System.out.println(isSparseMatrix(a));
		System.out.println(isSparseMatrix(iden));

	}

	private static boolean isSparseMatrix(int[][] a) {
		boolean isSparseMatrix = false;

		int row = a.length;
		int col = a[0].length;
		int total = row * col;

		int minRequired = total / 2;
		int zeroCount = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					zeroCount++;
				}
			}
		}
		if (zeroCount > minRequired) {
			isSparseMatrix=true;
		}
		return isSparseMatrix;
	}

	private static boolean isIdentityMatrix(int[][] a) {

		boolean isIdenMatrix = true;

		int rows = a.length;
		int cols = a[0].length;

		if (rows != cols) {
			isIdenMatrix = false;
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (i == j) {
						if (a[i][j] != 1) {
							isIdenMatrix = false;
							break;
						}
					} else {
						if (a[i][j] != 0) {
							isIdenMatrix = false;
							break;
						}
					}
				}
			}
		}

		return isIdenMatrix;
	}

}
