
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsUsingHashSet {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10};

        Set<Integer> OriginalElements = new HashSet<>();
        Set<Integer> Duplicate = new HashSet<>();

        for (int num : arr) {
            if (OriginalElements.contains(num)) {       // Checks the elements are already present in the set
                Duplicate.add(num);
            } else {
                OriginalElements.add(num);
            }

        }

        for (int Duplicates : Duplicate) {
            System.out.println(Duplicates);
        }

    }
}
