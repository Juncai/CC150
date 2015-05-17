package edu.neu.jun.chapter1.oneone.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neu.jun.chapter1.oneone.IsUniqueStr;

public class IsUniqueStrTest {

	@Test
	public void testIsUniqStr() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsUniqStr2() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsUniqStr3() {
		fail("Not yet implemented");
	}

	@Test
	public void testInplaceMerge() {
		fail("Not yet implemented");
	}

	@Test
	public void testSwap() {
		int arr[] = new int[]{1, 2, 3, 4, 5};
		int resultArr[] = new int[]{1, 3, 2, 4, 5};
		IsUniqueStr.swap(arr, 1, 2);
		assertArrayEquals(resultArr, arr);
	}

}
