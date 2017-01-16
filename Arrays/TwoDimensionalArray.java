package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 3 }, { 3, 2, 1, 0 }, { 3, 5, 6, 1 }, { 3, 8, 9, 4 } };
		int cols = 4;
		int rows = 4;
		int[][] myArray = new int[cols][rows];
		// Two nested loops allow us to visit every spot in a 2D array.
		// For every column I, visit every row J.
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
