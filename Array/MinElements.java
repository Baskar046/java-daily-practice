
public class MinElements {

    public static void main(String[] args) {

        int[] arr = {30, 10, 40, 80, 100};

        int min_elements = arr[0];      // start with index 0 position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min_elements) {        // comapre values.
                min_elements = arr[i];      // update with any elements lesser than index value.
            }
        }
        System.out.println(min_elements);

    }
}
