
import java.util.Scanner;

public class PrintElements {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = get.nextInt();

        int[] arr = new int[n];     // define size of array

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = get.nextInt();     // get the input from the user.
        }

        for (int values : arr) {
            System.out.print(values);   // print elements
        }

    }
}
