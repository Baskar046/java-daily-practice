
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedNum {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicate.add(num);
                break;
            } else {
                seen.add(num);
            }
        }

        System.out.println(duplicate.iterator().next());  // avoid the square bracket

    }
}
