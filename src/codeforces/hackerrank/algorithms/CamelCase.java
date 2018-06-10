package codeforces.hackerrank.algorithms;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }

    static int camelcase(String s) {
        // Complete this function
        int count = 1;
        for(int i = 0 ; i < s.length();i++){
            char tem = s.charAt(i);
            if((int)tem > 64 &&  (int)tem < 91)
                count++;
        }
        return count;
    }
}
