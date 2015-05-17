package edu.neu.jun.chapter1.oneone;

public class StringCompressor {
	
	public static String stringCompressor (String s){
		if (s.length() < 3) {	// string less than three chars cannot be compressed
			return s;
		}
		char lastChar = s.charAt(0);
		int charCnt = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == lastChar) {
				charCnt++;
			} else {
				sb.append(lastChar);
				lastChar = s.charAt(i);
				sb.append(charCnt);
				charCnt = 1;
			}
		}
		
		// handle last char
		sb.append(lastChar);
		sb.append(charCnt);
		String resultStr = sb.toString();
		return (resultStr.length() >= s.length()) ? s : resultStr;
	}
	
	public static void main(String[] args) {
		String s1 = "haahanihaoma";
		String s2 = "haaaaaahaniiiiihaoooooma";
		System.out.println(stringCompressor(s1));
		System.out.println(stringCompressor(s2));
	}
}
