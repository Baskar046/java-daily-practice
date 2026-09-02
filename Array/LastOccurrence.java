
public class LastOccurrence {

    public static int check(int numbers) {

        int[] arr = {4, 1, 4, 2, 4, 5, 4};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (numbers == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int element = 0;

        System.out.println(check(element));
    }
}
