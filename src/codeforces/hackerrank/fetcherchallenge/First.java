package codeforces.hackerrank.fetcherchallenge;

import java.util.Scanner;
import java.util.Stack;

public class First {


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int tree[] = new int[n];
            for (int j = 0; j < n; j++) {
                tree[j] = scanner.nextInt();
            }
            System.out.println(canRepresentBST(tree, n));
        }*/

        String[] strings = new String[]{
                "1100001",
                "1110001",
                "0110001",
                "0001100",
                "0001100",
                "0000010",
                "0010001"

        };

        int count = zombieCluster(strings);
        System.out.println(count);
    }

    static String canRepresentBST(int pre[], int n) {
        Stack<Integer> s = new Stack<Integer>();


        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (pre[i] < root) {
                return "NO";
            }


            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }

            s.push(pre[i]);
        }
        return "YES";
    }

    static int countHoles(int num) {
        String numStr = Integer.toString(num);
        int holesCount = 0;
        for (int i = 0; i < numStr.length(); i++) {
            char currentdigit = numStr.charAt(i);
            if (currentdigit == '0' || currentdigit == '4' || currentdigit == '6' || currentdigit == '9')
                holesCount++;
            else if (currentdigit == '8')
                holesCount += 2;
        }
        return holesCount;
    }

    static int zombieCluster(String[] zombies) {

        int N = zombies.length;

        int[][] M = new int [N][N];
        for(int i = 0; i<N ; i++) {
            for (int j = 0 ; j<N; j++) {
                M[i][j] = Integer.parseInt(zombies[i].charAt(j) + "");
            }
        }

        boolean visited[] = new boolean[N];
        boolean visiting[] = new boolean[N];

        int count = 0;
        for (int i = 0; i < N; ++i) {
            if(!visited[i]) {
                visiting[i] = true;
                DFS(M, N, visited, visiting, i);
                visited[i] = true;
                count++;
            }
        }
        return count;
    }

    static void DFS(int M[][], int N, boolean visited[], boolean[] visiting, int s)
    {
        if( !visited[s] ) {
            visiting[s] = true;
            for(int j = s+1; j < N; j++) {
                if(M[s][j] == 1 && !visited[j]) {
                    visiting[j] = true;
                    DFS(M, N, visited, visiting, j);
                    visited[j] = true;
                }
            }
        }
    }

}
