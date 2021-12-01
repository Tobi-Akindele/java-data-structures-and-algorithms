package arrays;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		System.out.println(Arrays.deepToString(rotateMatrix2(matrix)));
	}

	//brute force
	public static int[][] rotateMatrix(int[][] matrix) {
		int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			int[] rows = new int[matrix[0].length];
			for (int j = 0; j < matrix[0].length; j++) {
				rows[j] = matrix[matrix.length - 1 - j][i];
			}
			rotatedMatrix[i] = rows;
		}
		return rotatedMatrix;
	}
	
	public static int[][] rotateMatrix2(int [][] matrix) {
		if(matrix.length == 0 || matrix.length != matrix[0].length)
			return matrix;
		
		int numberOfRows = matrix.length;
		for(int layer = 0; layer < numberOfRows / 2; layer++) {
			int first = layer;
			int last = numberOfRows - 1 - layer;
			
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return matrix;
	}
}
