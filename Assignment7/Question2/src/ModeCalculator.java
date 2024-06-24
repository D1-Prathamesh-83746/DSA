import java.util.HashMap;
import java.util.Map;

public class ModeCalculator {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 5, 3, 6, 4, 4, 4, 4};

        int mode = calculateMode(array);

        System.out.println("Mode: " + mode);
    }

    public static int calculateMode(int[] array) {

        Map<Integer, Integer> countMap = new HashMap<>();

    
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
