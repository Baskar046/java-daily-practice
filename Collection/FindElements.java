import java.util.*;

public class FindElements {

    public static void main(String[] args){

        //This is the modifiable list.
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        //fixed list only for references
        List<Integer> list2 = Arrays.asList(30, 40, 50);

        list1.removeAll(list2);

        System.out.println(list1);

    }
}