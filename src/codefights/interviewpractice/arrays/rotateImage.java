package codefights.interviewpractice.arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(rotateImage(a));

    }

    static int[][] rotateImage(int[][] a) {
        int[][] res = new int[a.length][a.length];
        for (int i = a.length - 1,ii=0; i >= 0; i--,ii++) {
            for (int j = 0; j < a.length; j++) {
                res[j][ii] = a[i][j];
            }
        }
        return res;
    }
}
