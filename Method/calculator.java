import java.util.Scanner;

public class calculator{

    public static void add(int first_number,  int second_number){

        System.out.println(first_number + second_number);
    }

    public static void subtract(int first_number, int second_number){

        System.out.println(first_number - second_number);

    }

    public static void multiply(int first_number,  int second_number){

        System.out.println(first_number * second_number);

    }

    public static void division(int first_number,  int second_number){

        if(second_number!=0){
            System.out.println(first_number / second_number);
        }else{
            System.out.println("cannot calculate with 0");
        }

    }


    public static void main(String[] args){

        Scanner get = new Scanner(System.in);
        int user;


        do{

            System.out.println("1.addition");
            System.out.println("2.Subration");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Enter the input: ");
            user = get.nextInt();



            if(user == 1){

                System.out.print("first_number: ");
                int first_number = get.nextInt();

                System.out.print("second_number: ");
                int second_number = get.nextInt();

                add(first_number,second_number);

            }
            if(user == 2){

                System.out.print("first_number: ");
                int first_number = get.nextInt();

                System.out.print("second_number: ");
                int second_number = get.nextInt();

                subtract(first_number,second_number);

            }
            if(user == 3){

                System.out.print("first_number: ");
                int first_number = get.nextInt();

                System.out.print("second_number: ");
                int second_number = get.nextInt();

                multiply(first_number,second_number);

            }
            if(user == 4){

                System.out.print("first_number: ");
                int first_number = get.nextInt();

                System.out.print("second_number: ");
                int second_number = get.nextInt();

                division(first_number,second_number);
            }

        }while(user!=5);

    }
}