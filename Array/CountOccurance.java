
import java.util.Scanner;

public class CountOccurance {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the elements: ");
        int search = get.nextInt();

        int[] arr = {10, 20, 30, 10, 40};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;

            }
        }
        System.out.println("count: " + count);

    }
}
