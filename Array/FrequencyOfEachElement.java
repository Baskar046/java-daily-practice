
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
    }

}
