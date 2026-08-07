
import java.util.Scanner;

public class CountDigit {

    public static int Countdigit(int number) {

        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = get.nextInt();

        int result = Countdigit(number);
        System.out.println(result);

    }

}