package codeforces.ladderA;

import java.util.Scanner;

public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] childs = new int[n];
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int teamCount = 0;
		for (int i = 0; i < childs.length; i++) {
			int number = scanner.nextInt();
			childs[i] = number;
			if (number == 1)
				oneCount++;
			else if (number == 2)
				twoCount++;
			else if (number == 3)
				threeCount++;

		}

		teamCount = Math.min(oneCount, Math.min(twoCount, threeCount));
		System.out.println(teamCount);
		for (int i = 0; i < teamCount; i++) {
			boolean on = false,tw=false,th=false;
			for (int j = 0; j < childs.length; j++) {
				int child = childs[j];
				if(child==1 && on==false){
					on = true;
					System.out.print(j+1 + " ");
					childs[j]=0;
				}
				if(child==2 && tw==false){
					tw = true;
					System.out.print(j+1 + " ");
					childs[j]=0;
				}
				if(child==3 && th==false){
					th = true;
					System.out.print(j+1 + " ");
					childs[j]=0;
				}
				
			}System.out.println();
		}
	}

}
