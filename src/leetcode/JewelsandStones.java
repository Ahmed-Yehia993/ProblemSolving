package leetcode;

public class JewelsandStones {

    public static void main(String[]args){
        numJewelsInStones("aA","aAAbbb");
    }
    public static int numJewelsInStones(String J, String S) {
        int noj=0;
        for(int i = 0 ; i < J.length();i++){
            for (int j = 0; j < S.length(); j++) {
                if(J.charAt(i) == S.charAt(j)){
                    noj++;
                }
            }

        }
        return noj;
    }
}
