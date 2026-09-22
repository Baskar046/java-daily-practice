
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementsUsingHashMap {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = {10, 20, 30, 20, 40, 10};

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 2 || value > 2) {
                System.out.println(key);
            }
        }

    }
}
