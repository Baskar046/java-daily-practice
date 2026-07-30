
import java.util.Scanner;

public class Multiplication_table {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many tables you need,it's from default 1 to: ");
        int table = scan.nextInt();

        System.out.print("How many steps you may need: ");
        int steps = scan.nextInt();

        if (table > 0 && steps > 0) {
            for (int i = 1; i <= table; i++) {
                for (int j = 1; j <= steps; j++) {
                    System.out.print(j + "*" + i + "=" + i * j);
                    System.out.println();
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid table or steps");
        }
    }
}
