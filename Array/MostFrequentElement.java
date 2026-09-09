
class MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 1, 2, 1};
        int max_count = 0;
        int element = 0;
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max_count || count == max_count && arr[i] > element) {
                max_count = count;
                element = arr[i];
            }

        }

        System.out.println(element);

    }
}
