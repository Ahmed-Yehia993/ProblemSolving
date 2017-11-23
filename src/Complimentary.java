import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Complimentary {

    private static int[] numbers = new int[]{3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2, 3, 4, 5, 7, 5, 9, 1, 2};

    public static void main(String... args) {


        //fast(5, numbers);

        //foo_opt(5, numbers);

        String html = "<a >sadasd</a>";
       String noTags =  html.replaceAll("\\<.*?>","");
        System.out.println(noTags);
        String s = "Ahmed yehia mokhtar";
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].substring(0,1).toUpperCase() +strings[i].substring(1).toLowerCase() +" ");
        }
    }

    public static void fast(int k, int[] A) {
        Arrays.sort(A);
        int l = 0;
        int h = A.length - 1;

        while (h > l) {
            int sum = A[l] + A[h];
            if (sum == k) {
                System.out.println(A[l] + " " + A[h]);
                h--;
                l++;
            } else if (sum > k)
                h--;
            else
                l++;
        }

    }

    public static void foo_opt(int k, int[] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (i != j) {
                    if (A[i] + A[j] == k) {
                        System.out.println(A[i] + " " + A[j]);
                    }
                }
            }
        }

    }
}