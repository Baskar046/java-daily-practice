
import java.util.*;

public class RemoveDuplicateNumber_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> BeforeRemove = new ArrayList<>();

        BeforeRemove.add(1);
        BeforeRemove.add(1);
        BeforeRemove.add(3);
        BeforeRemove.add(4);
        BeforeRemove.add(4);
        BeforeRemove.add(6);
        BeforeRemove.add(6);
        BeforeRemove.add(8);

        HashSet<Integer> AfterRemove = new HashSet<>(BeforeRemove);

        BeforeRemove.clear();       // clear old element 
        BeforeRemove.addAll(AfterRemove);   // Add the non-Duplicate elements 

        System.out.println(BeforeRemove);

    }
}
