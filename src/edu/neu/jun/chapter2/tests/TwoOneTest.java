package edu.neu.jun.chapter2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.neu.jun.chapter2.LinkedListNode;
import edu.neu.jun.chapter2.TwoOne;

public class TwoOneTest {

	@Test
	public void testRemoveDuplicates() {
		LinkedListNode root = new LinkedListNode(0);
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(1);
		LinkedListNode n3 = new LinkedListNode(1);
		LinkedListNode n4 = new LinkedListNode(3);
		LinkedListNode n5 = new LinkedListNode(1);
		LinkedListNode n6 = new LinkedListNode(5);
		LinkedListNode n7 = new LinkedListNode(1);
		root.setPost(n1);
		n1.setPost(n2);
		n2.setPost(n3);
		n3.setPost(n4);
		n4.setPost(n5);
		n5.setPost(n6);
		n6.setPost(n7);
		n7.setPost(null);
		
		TwoOne.removeDuplicates(root);
		int[] res = new int[4];
		LinkedListNode tmp = root;
		int cnt = 0;
		while(tmp != null) {
			res[cnt++] = tmp.getVal();
			tmp = tmp.getPost();
		}
		int[] expected = new int[]{0, 1, 3, 5};
		assertArrayEquals(expected, res);
	}
	
	@Test
	public void testRemoveDuplicatesInPlace() {
		LinkedListNode root = new LinkedListNode(0);
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(1);
		LinkedListNode n3 = new LinkedListNode(1);
		LinkedListNode n4 = new LinkedListNode(3);
		LinkedListNode n5 = new LinkedListNode(1);
		LinkedListNode n6 = new LinkedListNode(5);
		LinkedListNode n7 = new LinkedListNode(1);
		root.setPost(n1);
		n1.setPost(n2);
		n2.setPost(n3);
		n3.setPost(n4);
		n4.setPost(n5);
		n5.setPost(n6);
		n6.setPost(n7);
		n7.setPost(null);
		
		TwoOne.removeDuplicatesInPlace(root);
		int[] res = new int[4];
		LinkedListNode tmp = root;
		int cnt = 0;
		while(tmp != null) {
			res[cnt++] = tmp.getVal();
			tmp = tmp.getPost();
		}
		int[] expected = new int[]{0, 1, 3, 5};
		assertArrayEquals(expected, res);
	}

}
