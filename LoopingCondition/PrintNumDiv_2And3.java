// Getting input from user starting and ending. Divided by both 2 and 3.

import java.util.Scanner;

public class PrintNumDiv_2And3 {
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int a = get.nextInt();

        System.out.print("enter the ending value: ");
        int b = get.nextInt();

        for(int i=a; i<=b; i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}
