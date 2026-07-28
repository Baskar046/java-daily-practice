/*
What is prime number:

    ->Prime numbers are the natural numbers greater than 1 with exactly two factors, i.e. 1 and the number itself.
 */

import java.util.Scanner;

public class CheckPrimeNum {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = get.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
            }

            if (count == 1) {
                System.out.print(num + " is the prime number");
            } else {
                System.out.print(num + " is not a prime number");
            }
        } else {
            System.out.println("1 is not a prime number");
        }
    }
}


/*
Calculation:

for(i=2; i<=num; i++) 

starts from 2 when i became a 5 loop will end.

If num = 5

if(num%i == 0)  

step 1: 5%2 == 3 (false)  -> count = 0

step 2: 5%3 == 2 (false) -> count = 0

step 3: 5%4 == 1 (false)    -> count = 0

step 4: 5%5 == 0 (true)  -> count = 1



 */
