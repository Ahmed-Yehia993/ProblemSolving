package codeforces.ladderA;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String args[]) {
/*        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();


        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));*/

        String s =  "<td>asdhadjassd</t><i>sdsadasd</i>";
        System.out.println(s.replaceAll("\\<.*?>",""));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
