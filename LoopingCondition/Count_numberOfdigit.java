import java.util.Scanner;

public class Count_numberOfdigit {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        int count = 0;

//        while(num!=0){        using while loop
//            num = num / 10;
//            count++;

        for(int i=0; i!=num;){  // using for loop
            num = num /10;
            count++;
        }

        System.out.println(count);
    }
}
