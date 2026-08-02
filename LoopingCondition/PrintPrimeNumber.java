//Question: Print prime numbers from 1 to n numbers. Get the input from the user.

import java.util.Scanner;

public class PrintPrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        int count;

        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);  // when count == 2. i number is printed.

            }

        }

    }
}
