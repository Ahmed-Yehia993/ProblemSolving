package codeforces.hackerrank.algorithms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TwoCharacters {

    static int twoCharaters(String s) {
        // Complete this function
        TreeMap<Character, Integer> dic = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!dic.containsKey(s.charAt(i))) {
                dic.put(s.charAt(i), 1);
            } else {
                int val = dic.get(s.charAt(i));
                dic.put(s.charAt(i), val + 1);
            }
        }

        Set<Entry<Character, Integer>> set = dic.entrySet();
        List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        return dic.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
