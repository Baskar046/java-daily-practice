/*
Print every number and tell whether it is Even or Odd.

Example

1 Odd
2 Even
3 Odd
4 Even
 */

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = get.nextInt();

        for(int i=1; i<=a; i++){
            if(i%2!=0){
                System.out.println(i + " Odd");
            }else{
                System.out.println(i + " Even");
            }
        }
        get.close();
    }
}
