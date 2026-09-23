
import java.util.*;

public class FirstNonRepeatingElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int find : arr) {
            if (map.get(find) == 1) {
                System.out.println(find);
                break;
            }
        }

    }
}
