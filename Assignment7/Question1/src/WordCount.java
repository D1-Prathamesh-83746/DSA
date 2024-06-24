import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String line = "This is a sample line with several words. This line is just a sample.";

        String[] words = line.toLowerCase().split("\\W+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
