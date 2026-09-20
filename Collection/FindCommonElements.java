
import java.util.*;

public class FindCommonElements {

    public static void main(String[] args) {

        HashSet<Integer> hash_1 = new HashSet<>();

        hash_1.add(10);
        hash_1.add(20);
        hash_1.add(30);
        hash_1.add(40);

        HashSet<Integer> hash_2 = new HashSet<>();

        hash_2.add(30);
        hash_2.add(40);
        hash_2.add(50);
        hash_2.add(60);

        hash_1.retainAll(hash_2);  // retainAll: Keep only the elements that are also present in the other collection.
        // retainAll() modifies hash_1. If you need to preserve the original Set, create a copy first:

        System.out.println(hash_1);

    }
}
