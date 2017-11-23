import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TopPhrases {

    public static void main(String[] args) {

        productArray(new int[]{5, 2, 3, 4,});
        InputStream inputStream = TopPhrases.class.getResourceAsStream("phrases.txt");

        System.out.println(getTopPhrases(inputStream));
    }

    public static Map<String, Integer> getTopPhrases(InputStream inputStream) {
        Map<String, Integer> topPharses = new LinkedHashMap<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] linePhrases = line.split("\\|");

                for (String phrase : linePhrases) {
                    if (!topPharses.containsKey(phrase)) {
                        topPharses.put(phrase, 1);
                    } else {
                        topPharses.put(phrase, topPharses.get(phrase).intValue() + 1);
                    }
                }

            }
            topPharses = topPharses.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return topPharses;
    }

    public static void productArray(int[] A) {
        int[] productArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int result = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    result *= A[j];
                }
            }
            productArray[i] = result;
        }
        for (int i = 0; i < productArray.length; i++) {
            System.out.println(productArray[i]);
        }

    }
}
