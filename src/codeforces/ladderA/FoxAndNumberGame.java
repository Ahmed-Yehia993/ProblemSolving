package codeforces.ladderA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FoxAndNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] number = new Integer[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number, Collections.reverseOrder());

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                while (number[i] > number[j]) {
                    number[i] = number[i] - number[j];
                    Arrays.sort(number, Collections.reverseOrder());
                }
            }
        }
        int sum = 0 ;
        for (int i = 0 ; i < number.length;i++){
            sum+=number[i];
        }
        System.out.println(sum);
    }
}
