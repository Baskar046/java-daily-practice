import java.util.*;

public class FindUniqueElements_In_Set1 {
    public static void main(String[] args) {

        Set<Integer> set_1 = new HashSet<>();

        set_1.add(1);
        set_1.add(2);
        set_1.add(3);
        set_1.add(4);
        set_1.add(5);

        Set<Integer> set_2 = new HashSet<>();

        set_2.add(5);
        set_2.add(4);
        set_2.add(6);
        set_2.add(7);

        Set<Integer> difference = new HashSet<>(set_1);

        difference.removeAll(set_2);       // Remove the elements from difference that are present in the set_2

        System.out.println(difference);


    }
}