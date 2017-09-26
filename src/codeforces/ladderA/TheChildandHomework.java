package codeforces.ladderA;

import java.util.HashMap;
import java.util.Scanner;

public class TheChildandHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        String s4 = scanner.nextLine();
        HashMap<String, Integer> counts = new HashMap<>();
        counts.put(s1.substring(0, 1), s1.substring(2).length());
        counts.put(s2.substring(0, 1), s2.substring(2).length());
        counts.put(s3.substring(0, 1), s3.substring(2).length());
        counts.put(s4.substring(0, 1), s4.substring(2).length());

        int gs = 0;
        String gk = "";
        for (String key : counts.keySet()) {
            String as = key;
            int len = counts.get(as);
            int cc = 0,cc2=0;
            for (String key2 : counts.keySet()) {
                String as2 = key2;
                int len2 = counts.get(key2);
                if (as != as2) {
                    if (len * 2 <= len2 )
                        cc++;
                    if(len / 2 >= len2)
                        cc2++;
                }
            }
            if (cc == 3 ||cc2 ==3) {
                gs++;
                gk = as;
            }
        }
        if (gs == 1)
            System.out.println(gk);
        else
            System.out.println("C");

    }
}
