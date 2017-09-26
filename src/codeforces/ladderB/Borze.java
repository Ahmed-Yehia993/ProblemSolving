package codeforces.ladderB;


import java.util.Scanner;

public class Borze {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char[] in = scanner.next().toCharArray();
        String res = "";
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '.')
                res += "0";
            if (in[i] == '-' && in[i + 1] == '.') {
                res += "1";
                i++;
            }
            if (in[i] == '-' && in[i + 1] == '-') {
                res += "2";
                i++;
            }
        }
        System.out.println(res);
    }
}
