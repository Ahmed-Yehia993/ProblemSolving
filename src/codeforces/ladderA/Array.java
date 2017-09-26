package codeforces.ladderA;

import java.util.Scanner;
import java.util.Vector;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        Vector<Integer> f = new Vector<>();
        Vector<Integer> s = new Vector<>();
        Vector<Integer> t = new Vector<>();
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                f.add(number[i]);
            }
            if (number[i] > 0) {
                s.add(number[i]);
            } else if(number[i] ==0){
                t.add(number[i]);
            }
        }
        if (f.size() % 2 == 0) {
            t.add(f.get(0));
            f.remove(0);
        }
        if (s.size() == 0) {
            s.add(f.get(0));
            f.remove(0);
            s.add(f.get(0));
            f.remove(0);
        }

        System.out.print(f.size() + " ");
        for (int i = 0; i < f.size(); i++) {
            System.out.print(f.get(i) + " ");
        }
        System.out.println();
        System.out.print(s.size() + " ");
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
        System.out.print(t.size() + " ");
        for (int i = 0; i < t.size(); i++) {
            System.out.print(t.get(i) + " ");
        }
        System.out.println();

    }
}
