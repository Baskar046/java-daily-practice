import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int a = get.nextInt();

        get.nextLine();

        System.out.print("Enter the operator (+, -, *, %, /): ");
        String operator = get.nextLine();

        System.out.print("Enter the value: ");
        int b = get.nextInt();


        if(operator.equals("+")){
            System.out.print(a+b);
        }else if(operator.equals("-")){
            System.out.print(a-b);
        }else if(operator.equals("*")){
            System.out.print(a*b);
        }else if(operator.equals("%")){
            if(b!=0){
                System.out.print((double)a%b);
            }else{
                System.out.print("cannot calculate with zero");
            }
        }else if(operator.equals("/")){
            if(b!=0){
                System.out.print((double)a/b);
            }else{
                System.out.print("cannot calculate with zero");
            }

        }else{
            System.out.print("Invalid Input ");
        }
        get.close();
    }
}