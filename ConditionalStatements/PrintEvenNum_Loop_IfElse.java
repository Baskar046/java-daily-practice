// Print even numbers between 1 to 10 using for loop and if else:

import java.util.Scanner;
public class PrintEvenNum_Loop_IfElse {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int a = get.nextInt();

        System.out.print("Enter the ending value: ");
        int b = get.nextInt();

        for(int c=a; c<=b; c=c+1 ) {
            if(c%2==0){
                System.out.println(c);
            }
        }
        get.close();
    }

}
 // 2.50.46