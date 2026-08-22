
import java.util.Scanner;

public class FindElementPosition {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Enter the elements: ");
        int userInput = get.nextInt();

        for (int j = 0; j < arr.length; j++) {
            if (userInput == arr[j]) {
                System.out.println(j);
            }
        }

    }
}
