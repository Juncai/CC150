package edu.neu.jun.chapter1.oneone;

import java.util.HashMap;

public class IsUniqueStr {
	
	public static boolean isUniqStr(String str){
		
		
		
		boolean cnt[] = new boolean[127];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = false;
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int idx = (int)c;
			if (cnt[idx]){
				return false;
			} else {
				cnt[idx] = true; 
			}
		}
		return true;
	}
	
	public static boolean isUniqStr2(String str){
		HashMap<Character, Boolean> cntMap = new HashMap<Character, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (cntMap.containsKey(c)) {
				return false;
			} else {
				cntMap.put(c, true);
			}
		}
		return true;
	}
	
	public static boolean isUniqStr3(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int idx = c - 'a';
			if ((cnt & (1 << idx)) > 0){
				return false;
			}
			cnt |= 1 << idx;
		}
		return true;
	}
	// 1 3 5 2 4 6
	// 1 3 5 2 4 6
	// 1 2 5 3 4 6
	// 1 2 5 3 4 6
	
	public static void inplaceMerge(int[] a, int l2Ptr) {
		int len = a.length;
		if (len < 2) return;
		int sortedPtr = 0;
		int l1Ptr = 0;
		int l1End = l2Ptr - 1;
		int l2End = len - 1;
		while (l1Ptr < l1End && l2Ptr < l2End) {
			int minIdx = (a[l1Ptr] < a[l2Ptr]) ? l1Ptr++ : l2Ptr++;
			swap(a, minIdx, sortedPtr++);
		}
		while (l1Ptr < l1End){
			
		}
		
	}
	
	public static void swap(int[] a, int pos1, int pos2) {
		int tmp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = tmp;
	}
	
	public static void main(String[] args) {
		String str = "hkhasdfjkl";
		if (isUniqStr3(str)) {
			System.out.println("unique");
		} else{
			System.out.println("not unique");
		}
	}
}
