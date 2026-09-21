
import java.util.*;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        Map<Integer, Integer> obj = new HashMap<>();

        for (int num : arr) {
            if (obj.containsKey(num)) {
                obj.put(num, obj.get(num) + 1);
            } else {
                obj.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : obj.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " -> " + value);
        }
    }
}
