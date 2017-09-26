package codeforces.ladderB;


import java.util.Scanner;
import java.util.Vector;

public class QueueattheSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        char[] queue = scanner.next().toCharArray();
        Vector<Swap> swaps = new Vector<>();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (queue[j] == 'B' && queue[j + 1] == 'G') {
                    Swap swap = new Swap();
                    swap.x = j;
                    swap.y = j + 1;
                    swaps.add(swap);

                }
            }
            for (int k = 0; k < swaps.size(); k++) {
                char tem = queue[swaps.get(k).x];
                queue[swaps.get(k).x] = queue[swaps.get(k).y];
                queue[swaps.get(k).y] = tem;

            }
            swaps.removeAll(swaps);
        }
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]);
        }
    }
}
class Swap {
    int x;
    int y;
}