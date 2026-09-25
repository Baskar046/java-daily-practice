
import java.util.*;

public class FindDuplicateChar {

    public static void main(String[] args) {

        String Input = "programming";

        Set<String> Org = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String word : Input.split("")) {
            if (Org.contains(word)) {
                duplicate.add(word);
            } else {
                Org.add(word);
            }
        }

        for (String words : duplicate) {
            System.out.println(words);
        }

    }

}
