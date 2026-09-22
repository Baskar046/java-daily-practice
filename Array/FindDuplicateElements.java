
public class FindDuplicateElements {

    public static void main(String[] args) {
        int count;
        int[] arr = {10, 20, 30, 20, 40, 10};
        boolean[] check = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (check[i]) {
                continue;
            }

            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    check[j] = true;
                }
            }

            if (count > 2 || count == 2) {
                System.out.println(arr[i]);
            }

        }
    }
}
