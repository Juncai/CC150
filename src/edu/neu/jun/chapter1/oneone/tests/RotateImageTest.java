package edu.neu.jun.chapter1.oneone.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neu.jun.chapter1.oneone.RotateImage;

public class RotateImageTest {

	@Test
	public void testRotateImage() {
		int[][] img = generateImg(3, 1, true);
		
		int[][] expectImg = generateImg(3, 1, false);
		
		RotateImage.rotateImage(img);
		assertArrayEquals(expectImg, img);
	}
	
	private int[][] generateImg(int n, int start, boolean origin) {
		int res[][] = new int[n][n];
		int x, y;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				x = i;
				y = j;
				if (!origin){
					int[] nextP = RotateImage.newPos(n, i, j);
					x = nextP[0];
					y = nextP[1];
				}
//				System.out.println("x: " + x + " y: " + y);
				res[x][y] = start++; 
			}
		}
		return res;
	}

	@Test
	public void testRotatePixal() {
		int[][] img = new int[2][2];
		img[0][0] = 1;
		img[0][1] = 2;
		img[1][1] = 3;
		img[1][0] = 4;
		
		int[][] expectImg = new int[2][2];
		expectImg[0][0] = 4;
		expectImg[0][1] = 1;
		expectImg[1][1] = 2;
		expectImg[1][0] = 3;
		
		RotateImage.rotatePixal(img, 0, 0);
		assertArrayEquals(expectImg, img);
	}

	@Test
	public void testNewPos() {
		int newP[] = RotateImage.newPos(2, 1, 1);
		assertArrayEquals(new int[]{1, 0}, newP);
	}

}
