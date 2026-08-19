
public class SecondSmallNum {

    public static void main(String[] args) {

        int[] arr = {30, 10, 40, 80, 100};

        int smallest_number = arr[0];
        int sec_min_elements = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest_number) {
                sec_min_elements = smallest_number;
                smallest_number = arr[i];
            }
        }
        System.out.println(sec_min_elements);

    }
}
