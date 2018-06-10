package leetcode;

public class FlippinganImage {

    public static void main(String[]args){
        flipAndInvertImage(new int [][]{{1,1,0},{1,0,1},{0,0,0}});
    }
    public static  int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[i][A[i].length - 1 - j] = A[i][j];
            }
        }
        return invertImage(B);
    }

    public static int[][] invertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }
        return A;
    }
}
