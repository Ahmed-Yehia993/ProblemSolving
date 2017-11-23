package codefights.interviewpractice.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstNotRepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));

    }

    static char firstNotRepeatingCharacter(String s) {
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap <>();
        for (int i = 0; i < s.length(); i++) {
            if (!counts.containsKey(s.charAt(i))) {
                counts.put(s.charAt(i), 1);
            } else {
                int co = counts.get(s.charAt(i));
                counts.put(s.charAt(i), co + 1);
            }
        }
        for (Character c : counts.keySet()) {
            char key = c;
            int val = counts.get(c);
            if (val == 1) {
                return key;
            }
        }
        return '_';

    }

}
