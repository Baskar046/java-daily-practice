
public class LargestAndSmallestNum {

    public static void main(String[] args) {

        int[] arr = {20, 80, 5, 100, 11};

        int lar_value = arr[0];
        int sec_lar_value = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar_value) {
                sec_lar_value = lar_value;
                lar_value = arr[i];
            }
        }
        System.out.println("largest NUmber: " + lar_value);
        System.out.println("second largest number: " + sec_lar_value);
    }
}
