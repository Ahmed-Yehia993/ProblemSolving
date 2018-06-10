package hackerrank.Implementation;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int type1 = 0, typ2 = 0, type3 = 0, type4 = 0, type5 = 0;
        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (!dic.containsKey(ar[i])) {
                dic.put(ar[i], 1);
            } else {
                int val = dic.get(ar[i]);
                dic.put(ar[i], val += 1);
            }
        }
        Integer key = Collections.max(dic.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
