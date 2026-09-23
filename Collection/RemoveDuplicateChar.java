
import java.util.*;

public class RemoveDuplicateChar {

    public static void main(String[] args) {

        String Input = "programming";

        Set<String> set = new LinkedHashSet<>();

        for (String words : Input.split("")) {
            set.add(words);

        }

        for (String Char : set) {
            System.out.print(Char);
        }

    }
}
