// switch with String → Java automatically performs the comparison for each case.

// For primitive types (int, char, etc.), switch compares values directly (conceptually like ==).


//Question: creating a calculator using switch case statements.

import java.util.Scanner;

public class CalculatorSwitch{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int a = get.nextInt();

        get.nextLine();
        System.out.print("Enter the operator('+','-','*','%','/'): ");
        String operator = get.nextLine();

        System.out.print("Enter the value: ");
        int b = get.nextInt();

        switch(operator){
            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "%":
                if(b!=0){
                    System.out.println(a%b);
                }else{
                    System.out.println("Cannot calculate by zero!");
                }
            break;

            case "/":
                if(b!=0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Cannot calculate by zero!");
                }
            break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}