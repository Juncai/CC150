package edu.neu.jun.chapter1.oneone;

public class RotateImage {
	
	public static void rotateImage(int[][] img) {
		// 11 -> 1N 12->2N 21->1(N-2+1)
		// 1N -> NN 
		// N1 -> 11
		// first transpose then mirror
		int d = img.length;
		if (d < 2) return;
		for (int i = 0; i < d / 2; i++) {
			for (int j = i; j < d - i - 1; j++) {
				rotatePixal(img, i, j);
			}
		}
	}
	
	/**
	 * @param img
	 * @param x
	 * @param y
	 */
	public static void rotatePixal(int[][] img, int x, int y) {
		int origin = img[x][y];
		int tmp;
		int[] nextP;
		int d = img.length;
		for (int i = 0; i < 4; i++) {
			nextP = newPos(d, x, y);
			x = nextP[0];
			y = nextP[1];
			tmp = img[x][y];
			img[x][y] = origin; 
			origin = tmp;
		}
	}
	
	/**
	 * Calculate new position of a point after the rotation.
	 * By first transposing then mirror
	 * @param x
	 * @param y
	 * @return
	 */
	public static int[] newPos(int d, int x, int y) {
		return new int[]{y, d - x - 1};
	}
	
	public static void main(String[] args) {
		
		
	}
}
