
import java.util.Scanner;
public class FindSumAndAvgUsingDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mark;
        int total = 0;
        int count = 0 ;

        do {
            System.out.print("Enter the number: ");
            mark = scan.nextInt();
            if(mark>-1) {       // check the user marks, is above -1
                total = total + mark;
                count ++;   // count each iteration except -1
            }
        } while (mark != -1);   // condition false when user enter the -1
        System.out.println(total);

        if(count>0) {   // avg will calculate when count above the zero.
          double  avg = (double) total / count;     // double value cannot calculate with integer. So, convert into int into double.
            System.out.println(avg);
        }else{
            System.out.println("no marks are entered...");  // it prints when user enter the -1 at starting
        }
    }
}