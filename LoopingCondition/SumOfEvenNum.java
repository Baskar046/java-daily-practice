/*
Question:
Find the sum of all even numbers from 1 to n numbers. Get the input from the user.


 */

import java.util.Scanner;

public class SumOfEvenNum {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = get.nextInt();
        int sum = 0;    // initialize sum = 0

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;  // Add even value into sum when if condition became true.
            }
        }
        System.out.print(sum);  // Printing even sum value.
    }
}
