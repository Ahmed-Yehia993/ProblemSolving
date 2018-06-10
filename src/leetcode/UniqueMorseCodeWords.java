package leetcode;

import java.util.HashSet;

public class UniqueMorseCodeWords {

    public static final String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> patterns = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = 0; j < words[i].length(); j++) {
                word += codes[words[i].charAt(j) - 'a'];
            }
            patterns.add(word);
        }
        return patterns.size();
    }
}
