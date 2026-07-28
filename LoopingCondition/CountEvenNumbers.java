
import java.util.Scanner;

public class CountEvenNumbers {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int a = get.nextInt();
        int count = 0;

        for (int i = 1; i <= a; i = i + 1) {
            if (i % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.print("Total Even numbers Within " + a + ": " + count);
    }
}
