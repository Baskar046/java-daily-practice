
import java.util.Scanner;

public class CheckStringStartsAndEnds {

    public static void main(String[] args) {

        Scanner gmail = new Scanner(System.in);

        System.out.print("enter the email address: ");
        String check = gmail.nextLine();

        if (check.startsWith("user") && check.endsWith(".com")) {
            System.out.println("verified");
        } else {
            System.out.println("not verified");
        }

    }
}
