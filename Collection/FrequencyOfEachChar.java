
import java.util.*;

public class FrequencyOfEachChar {

    public static void main(String[] args) {

        String Input = "banana";

        Map<String, Integer> map = new HashMap<>();

        for (String word : Input.split("")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " = " + value);
        }

    }

}
