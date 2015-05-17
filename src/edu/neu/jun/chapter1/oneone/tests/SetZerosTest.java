package edu.neu.jun.chapter1.oneone.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neu.jun.chapter1.oneone.SetZeros;

public class SetZerosTest {

	@Test
	public void testSetZeros() {
		int[][] origin = new int[3][3];
		origin[1][1] = 1;
		int[][] expected = new int[3][3];
		SetZeros.setZeros(origin);
		assertArrayEquals(expected, origin);
	}

}
