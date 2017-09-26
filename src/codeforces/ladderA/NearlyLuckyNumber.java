package codeforces.ladderA;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numb = in.nextLine();
        int c = 0;
        for (int i = 0; i < numb.length(); i++)
            if (numb.charAt(i) == '4' || numb.charAt(i) == '7')
                c++;
        String sum = Integer.toString(c);
        int len = 0;
        for (int i = 0; i < sum.length(); i++)
            if (sum.charAt(i) == '4' || sum.charAt(i) == '7')
                len++;
        if (len == sum.length())
            System.out.println("YES");
        else
            System.out.println("NO");


        in.close();
    }
}
