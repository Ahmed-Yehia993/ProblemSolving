package codefights.interviewpractice.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CryptSolution {

    public static void main(String[] args) {
        String[] crypt = {"SEND", "MORE", "MONEY"};
        char[][] solution = {{'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}};
       // System.out.println(isCryptSolution(crypt, solution));
       // System.out.println(pre("acacbab"));
    }

    static boolean isCryptSolution(String[] crypt, char[][] solution) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < solution.length; i++) {
            map.put(solution[i][0], solution[i][1]);
        }
        List<String> list = new ArrayList<>();
        for (String str : crypt) {
            if (map.get(str.charAt(0)) == '0' && str.length() > 1) return false;
            StringBuilder s = new StringBuilder();
            for (char c : str.toCharArray()) {
                s.append(map.get(c) + "");
            }
            list.add(s.toString());
        }
        System.out.println(list.toString());
        double num1 = Double.parseDouble(list.get(0));
        double num2 = Double.parseDouble(list.get(1));
        double num3 = Double.parseDouble(list.get(2));
        if (num1 + num2 == num3) return true;
        return false;
    }

    static int[] pre(String s) {

        int z[] = new int[s.length()];
        z[0] = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            int pref = z[i-1];
            while (pref > 0 && s.charAt(i) != s.charAt(pref)) {
                pref = z[pref-1];
            }
            if (s.charAt(i) == s.charAt(pref)) {
                ++pref;
            }
            z[i] = pref;

        }
        return z;
    }
}
