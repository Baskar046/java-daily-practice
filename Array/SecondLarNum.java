
public class SecondLarNum {

    public static void main(String[] args) {

        int[] arr = {30, 10, 40, 80, 100};


        int largest_number =  arr[0];
        int sec_max_elements =0;

        for (int i = 0; i < arr.length; i++) {      
            if (arr[i] > largest_number) {
                sec_max_elements = largest_number;
                largest_number = arr[i];
            }
        }
        System.out.println(sec_max_elements);

    }
}
