package codeforces.ladderA;

import java.util.Scanner;

public class AntonandDanik {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[]matches = scanner.next().toCharArray();
        int anCount=0;
        int dCount = 0;
        for (int i = 0; i < matches.length; i++) {
            if(matches[i]=='A')
                anCount++;
            else
                dCount++;
        }
        if(anCount > dCount){
            System.out.println("Anton");
        }else if(anCount< dCount){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
