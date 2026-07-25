import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        int year = get.nextInt();

        //Part: leap year condition     century year condition
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("It's a Leap year");
        }else{
            System.out.println("It's not a leap year");
        }

    }
}
