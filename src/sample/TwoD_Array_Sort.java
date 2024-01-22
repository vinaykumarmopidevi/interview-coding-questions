package sample;

import java.util.Arrays;

public class TwoD_Array_Sort {

	public static void main(String[] args) {
		_2d_column_sorting();
		//_2d_row_sorting();
	}
	public static void _2d_column_sorting() {
		// Sample 2D array
		int[][] twoDimensionalArray = { { 4, 2, 8 }, { 1, 7, 5 }, { 3, 9, 6 },{ 5, 12, 1 } };
		System.out.println("before sort");
		for (int[] row : twoDimensionalArray) {
			System.out.println(Arrays.toString(row));
		}
		// Transpose the array to switch rows and columns, sort each row (originally
		// column)
		for (int i = 0; i < twoDimensionalArray[0].length; i++) {
			int[] column = new int[twoDimensionalArray.length];
			for (int j = 0; j < twoDimensionalArray.length; j++) {
				column[j] = twoDimensionalArray[j][i];
			}
			Arrays.sort(column);
			for (int j = 0; j < twoDimensionalArray.length; j++) {
				twoDimensionalArray[j][i] = column[j];
			}
		}

		// Output the sorted array
		System.out.println("after sort");
		for (int[] row : twoDimensionalArray) {
			System.out.println(Arrays.toString(row));
		}
	}
	public static void _2d_row_sorting() {
		
		        // Sample 2D array
		        int[][] twoDimensionalArray = {
		            {4, 2, 8},
		            {1, 7, 5},
		            {3, 9, 6}
		        };
		        System.out.println("before sort");
		        for (int[] row : twoDimensionalArray) {
		            System.out.println(Arrays.toString(row));
		        }
		        // Sorting each row
		        for (int[] row : twoDimensionalArray) {
		            Arrays.sort(row);
		        }

		        // Output the sorted array
		        System.out.println("after sort");
		        for (int[] row : twoDimensionalArray) {
		            System.out.println(Arrays.toString(row));
		        }
		  
	}

}
