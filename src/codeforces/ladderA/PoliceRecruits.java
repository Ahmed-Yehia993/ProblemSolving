package codeforces.ladderA;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        int unTreatedCrime = 0;
        int numberOfPolice = 0;
        for (int i = 0; i < e; i++) {
            int crime = scanner.nextInt();
            if (crime == -1 && numberOfPolice == 0) {
                unTreatedCrime++;
            }
            if (crime == -1 && numberOfPolice > 0) {
                numberOfPolice--;
            }
            if (crime > 0) {
                numberOfPolice += crime;
            }
        }
        System.out.println(unTreatedCrime);
    }
}
