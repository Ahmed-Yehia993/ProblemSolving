package hackerrank.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);

        long minSum = 0, maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }
        for (int i = arr.length - 1; i >= arr.length - 4; i--) {
            maxSum += arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }
}
