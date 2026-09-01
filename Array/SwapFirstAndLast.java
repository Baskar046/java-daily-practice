
import java.util.Arrays;

public class SwapFirstAndLast {

    public static void swap(int[] arr) {

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        swap(arr);

        System.out.println(Arrays.toString(arr));
    }

}
