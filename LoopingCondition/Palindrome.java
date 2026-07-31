
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int original_num = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;   // Get the unit digit
            rev = rev * 10 + digit;   // reverse the number
            num = num / 10;     // remove the unit digit
        }

        if (rev == original_num) {
            System.out.println("palindrome");
        } else {
            System.out.println("it's not a palindrome");
        }

    }
}
