package codeforces;

import java.util.Arrays;
        import java.util.Scanner;

public class LittleElephantandBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int ind = number.indexOf('0');
        if (ind == -1)
            System.out.println(number.substring(0, number.length() - 1));
        else
            System.out.println(number.substring(0, ind) + number.substring(ind + 1, number.length()));
    }
}
