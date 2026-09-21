
import java.util.*;

public class ReterivalMap {

    public static void main(String[] args) {

        Map<Integer, String> Emp = new HashMap<>();

        Emp.put(1, "baskar");
        Emp.put(2, "rowan");
        Emp.put(3, "Siva");
        Emp.put(4, "dinesh");
        Emp.put(5, "hari");

        for (Map.Entry<Integer, String> entry : Emp.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);

        }

    }
}
