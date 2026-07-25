import java.util.Scanner;

public class BankLoanApprovalChecking{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the Age: ");
        int Age = get.nextInt();

        System.out.print("Enter the Salary: ");
        double Salary = get.nextDouble();

        System.out.print("Enter the CIBIL Score: ");
        int CIBIL = get.nextInt();

        if(Age >= 21){
            if(Salary >= 30000){
                if(CIBIL >= 750){
                    System.out.println("Your eligible  forLoan");
                }
                else{
                    System.out.println("Your CIBIL is lower than 750 ");
                }
            }else{
                System.out.println("Your Salary is lower than 30,000 ");
            }
        }else{
            System.out.println("Your Age is lower than 21 ");
        }

        get.close();
    }
}