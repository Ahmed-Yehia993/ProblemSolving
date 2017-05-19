package codeforces.ladderA;

import java.util.Scanner;

public class Dubstep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String song = scanner.nextLine().replaceAll("WUB", "-").replaceAll("-+", "-");
		if(song.startsWith("-")){
			song = song.replaceFirst("-", "");
		}
		if(song.endsWith("-")){
			song = song.substring(0, song.length() - 1);
		}
		song = song.replaceAll("-", " ");
		System.out.println(song);
	}

}
