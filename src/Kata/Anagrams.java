package Kata;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams s = new Anagrams();
		System.out.println( s.isAnagrams("Mother In Law", "Hitler Woman"));
		String x = "When not studying nuclear physics Bambi likes to play beach volleyball";
	}
	public boolean isAnagrams(String x,String y){
		char[] xChar= x.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[]yChar = y.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(xChar);
		Arrays.sort(yChar);
		System.out.println(xChar);
		System.out.println(yChar);
		return Arrays.equals(xChar, yChar);
	}
}
