
import java.util.Arrays;

public class CopyAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] copy_arr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy_arr[i] = arr[i];

        }
        System.out.println(Arrays.toString(copy_arr));
    }
}
