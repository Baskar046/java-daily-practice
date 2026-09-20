import java.util.*;

public class ArrayList_MinValue {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(null);
        numbers.add(-1);



        int smallest_num = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {

           if(numbers.get(i)!=null) {
               if (numbers.get(i) < smallest_num) {
                   smallest_num = numbers.get(i);
               }
           }
        }

        System.out.println("Smallest Number: " + smallest_num);


    }
}