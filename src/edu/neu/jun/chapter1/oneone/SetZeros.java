package edu.neu.jun.chapter1.oneone;

public class SetZeros {
	public static void setZeros(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		boolean[] zeroRows = new boolean[n];
		boolean[] zeroColumns = new boolean[m];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0 ) {
					zeroRows[i] = true;
					zeroColumns[j] = true;
				}
			}
		}
		
		for (int i = 0; i < zeroRows.length; i++) {
			if (zeroRows[i]){
				for (int j = 0; j < m; j++) {
					matrix[i][j] = 0; 
				}
			}
		}
		
		for (int i = 0; i < zeroColumns.length; i++) {
			if (zeroColumns[i]){
				for (int j = 0; j < n; j++) {
					matrix[j][i] = 0; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		boolean[] t = new boolean[2];
		System.out.println("first: " + t[0]);
		System.out.println("second: " + t[1]);
	}
}
