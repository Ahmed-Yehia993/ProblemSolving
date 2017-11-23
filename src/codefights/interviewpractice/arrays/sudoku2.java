package codefights.interviewpractice.arrays;

import java.util.BitSet;
import java.util.HashSet;

public class sudoku2 {
    public static void main(String[] args) {

    }

    static boolean sudoku2(char[][] grid) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> row = new HashSet<>();
            int count = 0;
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != '.') {
                    row.add(Integer.parseInt(grid[i][j] + ""));
                    count++;
                }

            }
            if (row.size() != count) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> row = new HashSet<>();
            int count = 0;
            for (int j = 0; j < 9; j++) {
                if (grid[j][i] != '.') {
                    row.add(Integer.parseInt(grid[j][i] + ""));
                    count++;
                }

            }
            if (row.size() != count) {
                return false;
            }
        }
        for (int rowOffset = 0; rowOffset < 9; rowOffset += 3) {
            for (int columnOffset = 0; columnOffset < 9; columnOffset += 3) {
                BitSet threeByThree = new BitSet(9);
                for (int i = rowOffset; i < rowOffset + 3; i++) {
                    for (int j = columnOffset; j < columnOffset + 3; j++) {
                        if (grid[i][j] == '.') continue;
                        if (threeByThree.get(grid[i][j] - 1))
                            return false;
                        else
                            threeByThree.set(grid[i][j] - 1);
                    }
                }
            }
        }
        return true;
    }
}
