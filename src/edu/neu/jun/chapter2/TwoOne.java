package edu.neu.jun.chapter2;

import java.util.HashSet;

public class TwoOne {
	public static void removeDuplicates(LinkedListNode root) {
		if (root == null) return;
		HashSet<Integer> seenNode = new HashSet<Integer>();
		seenNode.add(root.getVal());
		LinkedListNode tmp = root;
		LinkedListNode cNode = root.getPost();
		while (cNode != null) {
			if (seenNode.contains(cNode.getVal())) {
				cNode = cNode.getPost();
				tmp.setPost(cNode);
			} else {
				seenNode.add(cNode.getVal());
				tmp = cNode;
				cNode = cNode.getPost();
			}
		}
	}
	
	public static void removeDuplicatesInPlace(LinkedListNode root){
		if (root == null) return;
		LinkedListNode cNode = root;
		LinkedListNode tmp;
		LinkedListNode pre;
		while (cNode != null) {
			pre = cNode;
			tmp = pre.getPost();
			while (tmp != null) {
				if (tmp.getVal() == cNode.getVal()) {
					pre.setPost(tmp.getPost());
				} else {
					pre = tmp;
				}
				tmp = tmp.getPost();
			}
			cNode = cNode.getPost();
		}
	}
}
