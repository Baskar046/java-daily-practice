import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int reverse_num =0;

        while(num!=0){
            int digit = num % 10;
            reverse_num = reverse_num * 10 + digit;  
            num = num / 10;
        }
        System.out.println(reverse_num);
    }
}
