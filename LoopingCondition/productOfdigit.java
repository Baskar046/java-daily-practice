import java.util.Scanner;

public class productOfdigit {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int product_num = 1;

        while(num!=0){
            int digit = num%10;
            product_num = product_num * digit;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + product_num);
    }
}
