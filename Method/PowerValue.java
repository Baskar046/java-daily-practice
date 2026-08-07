import java.util.Scanner;

public class PowerValue{

    public static int power(int base, int exponent){

        int power_value = 1;

        for(int i=1; i<=exponent; i++ ){

            power_value = power_value * base;   

        }

        return power_value;

    }

    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = get.nextInt();

        System.out.print("Enter the exponent ");
        int exponent = get.nextInt();

        int result = power(base, exponent);
        System.out.println(result);

    }


}