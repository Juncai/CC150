package edu.neu.jun.chapter2;

public class LinkedListNode {
	private int val;
	private LinkedListNode pre;
	private LinkedListNode post;
	
	public LinkedListNode(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public LinkedListNode getPre() {
		return pre;
	}
	public void setPre(LinkedListNode pre) {
		this.pre = pre;
	}
	public LinkedListNode getPost() {
		return post;
	}
	public void setPost(LinkedListNode post) {
		this.post = post;
	}
	
	
}
