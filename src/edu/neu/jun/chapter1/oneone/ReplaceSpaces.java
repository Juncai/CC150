package edu.neu.jun.chapter1.oneone;

public class ReplaceSpaces {
	public static void replaceSpaces(char[] cArr, int len) {
		int spaceCnt = 0;
		for (int i = 0; i < len; i++) {
			if (cArr[i] == ' ') {
				spaceCnt++;
			}
		}
		int newEndPtr = len + 2 * spaceCnt -1;
		int oldEndPtr = len - 1;
		while (oldEndPtr > 0) {
			if (cArr[oldEndPtr] == ' ') {
				cArr[newEndPtr--] = '0';
				cArr[newEndPtr--] = '2';
				cArr[newEndPtr--] = '%';
				oldEndPtr--;
			} else {
				cArr[newEndPtr--] = cArr[oldEndPtr--];
			}
		}
	}
	
	public static void main(String[] args) {
		char cA[] = new char[]{'2', 'd', ' ', 'j', ' ', ' ', ' ', ' ', ' '};
		int l = 5;
		replaceSpaces(cA, l);
		System.out.println(new String(cA));
	}
}
