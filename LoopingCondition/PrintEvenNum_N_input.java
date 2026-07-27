/*
Read a number N.

Print all even numbers up to N.

Example

Input

15

Output

2
4
6
8
10
12
14

 */

import java.util.Scanner;

public class PrintEvenNum_N_input{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = get.nextInt();

        for(int i=1; i<=n ; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        get.close();

    }

}
