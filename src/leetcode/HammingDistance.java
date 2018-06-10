package leetcode;

public class HammingDistance {
public static void main(String[]args){
    hammingDistance(1,4);
}
    public static int hammingDistance(int x, int y) {
        int ans = 0;
        for(int i=0; i<31; i++){ // 0-31 is because of given range (32 bits integer)
            int xBit = x%2;
            int yBit = y%2;
            if(xBit != yBit){
                ans++;
            }
            x /= 2; // Same as x >>= 2
            y /= 2; // Same as y >>= 2
        }
        return ans;
    }
}
