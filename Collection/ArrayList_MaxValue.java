
import java.util.*;

public class ArrayList_MaxValue {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int largest_num = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largest_num) {
                largest_num = numbers.get(i);
            }
        }

        System.out.println("Largest Number: " + largest_num);
    }
}
