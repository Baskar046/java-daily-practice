// Get input for variable a and b and print the number from a to b:

import java.util.Scanner;

public class LoopCondition {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Num_1 = get.nextInt();

        System.out.print("Enter the Number: ");
        int Num_2 = get.nextInt();

        for (int Num_3 = Num_1; Num_3<=Num_2; Num_3 = Num_3+1){
            System.out.println(Num_3);
        }

        get.close();
    }
}
