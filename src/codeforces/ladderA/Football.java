package codeforces.ladderA;

import java.util.HashMap;
import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> goals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String goal = scanner.next();
            if (!goals.containsKey(goal)) {
                goals.put(goal, 1);
            } else {
                Integer newSc = Integer.sum(goals.get(goal), 1);
                goals.put(goal, newSc);
            }
        }


        System.out.println(goals.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());

    }
}
