/*

Print all factors of N.

Example

Input

12

Output

1
2
3
4
6
12
 */


import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = get.nextInt();

        for(int i=1; i<=n; i++){
            if(2%i==0){        //  Finds Divisors of 2
                System.out.println(i);
            }
        }
    }
}

/*

Calculation:

     2 % i == 0 (Finds Divisors of 2)

    i = 1: 2 % 1 = 0 (Reminder is 0 ➔ True, prints 1)

    i = 2: 2 % 2 = 0 (Reminder is 0 ➔ True, prints 2)

    i = 3: 2 % 3 = 2 (Reminder is 2 ➔ False, division by a larger number leaves i itself as remainder)

    i = 4: 2 % 4 = 2 (Reminder is 2 ➔ False)


 What is difference between factors and multiply:

 Definition:
    -> factors are numbers that divide evenly into another number.
    
    -> multiples are the results of multiplying a number by whole integers.
    
 Example:
    
     factors
        |
    1 * 2 = 2  - multiples
    |       
  factors
  
 Size:
    -> Factors are always smaller than or equal to the number.

    -> multiples are always larger than or equal to the number.


Finding multiply:

    i % 2 == 0 (Finds Even Numbers)

    i = 1: 1 % 2 = 1 (Reminder is not 0 ➔ False)

    i = 2: 2 % 2 = 0 (Reminder is 0 ➔ True, prints 2)

    i = 3: 3 % 2 = 1 (Reminder is not 0 ➔ False)

    i = 4: 4 % 2 = 0 (Reminder is 0 ➔ True, prints 4)
 */