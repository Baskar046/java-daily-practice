
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5};
        boolean[] visited = new boolean[arr.length];  // [F,  F,  F,  F,  F,  F]
        int count;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;

                    visited[j] = true;

                }

            }
            System.out.println(arr[i] + " -> " + count);

        }


        //Using the hashmap method.
        Map<Integer, Integer> map1= new HashMap<>();

        for(int num_1 : arr){
            map1.put(num_1, map1.getOrDefault(num_1,0) + 1);
        }
        System.out.println(map1);
    }

}
