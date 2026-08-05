
import java.util.Scanner;

public class checkPrimenumber {

    public static String countEvenNum(int number) {
        int countNum = 0;
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                countNum += 1;
            }

        }
        if (countNum == 2) {
            return "Prime Number";
        }
        return "It's not a prime number";
    }

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int getInput = get.nextInt();

        String result = countEvenNum(getInput);
        System.out.println(result);

        get.close();
    }
}
