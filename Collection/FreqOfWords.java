
import java.util.*;

public class FreqOfWords {

    public static void main(String[] args) {

        String Input = "Java Selenium Java TestNG Selenium Java";

        Map<String, Integer> map = new HashMap<>();

        for (String words : Input.split(" ")) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " -> " + value);
        }

    }
}
