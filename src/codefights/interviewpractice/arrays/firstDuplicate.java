package codefights.interviewpractice.arrays;

import java.util.HashSet;

public class firstDuplicate {

    public static void main(String[] args) {
        int[]a = {1};
        System.out.println(firstDuplicate(a));

    }

    static int firstDuplicate(int[] a) {
        HashSet<Integer> number = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (number.contains(a[i])) {
                return a[i];
            } else {
                number.add(a[i]);
            }
        }
        return -1;
    }
}
