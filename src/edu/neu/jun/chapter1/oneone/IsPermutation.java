package edu.neu.jun.chapter1.oneone;

import java.util.Arrays;

public class IsPermutation {
	
	public static boolean isPermutation(String s1, String s2) {
		char s1Arr[] = s1.toCharArray();
		char s2Arr[] = s2.toCharArray();
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);
		String new1 = new String(s1Arr);
		String new2 = new String(s2Arr);
		return new1.equals(new2);
	}
	
	public static void main(String[] args) {
		String s1 = "woshishei";
		String s2 = "sheishiwo";
		if (isPermutation(s1, s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
