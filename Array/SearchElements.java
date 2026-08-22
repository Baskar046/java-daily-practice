
import java.util.Scanner;

public class SearchElements {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = get.nextInt();       // determine the array size by user. 

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = get.nextInt();         // get elements from the user.
        }

        boolean check = false;  // initialize  the boolean as false 

        System.out.print("Enter the number to check: ");
        int UserInput = get.nextInt();

        for (int numbers : arr) {
            if (UserInput == numbers) {
                check = true;   // if condition will pass. Check becomes true
            }
        }

        System.out.println(check);

    }
}
