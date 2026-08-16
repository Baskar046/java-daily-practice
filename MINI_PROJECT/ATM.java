import java.util.Scanner;

        public class ATM{


           private static double amount;
           private static  int UserDB = 546;

            public static Scanner get = new Scanner(System.in);


            public static void ShowMenu(){

                while(true) {
                    System.out.println("=====ATM SYSTEM======");

                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Change PIN");
                    System.out.println("5. Exit");

                    int MenuInput = get.nextInt();

                    switch (MenuInput) {
                        case 1:
                            Check_Balance();
                            break;
                        case 2:
                            Deposit_Money();
                            break;
                        case 3:
                            Withdraw_Money();
                            break;
                        case 4:
                            Change_PIN();
                            break;
                        case 5:
                            Exit();
                            break;
                        default:
                            System.out.println("Enter the valid Input");
                            break;
                    }
                    if(MenuInput == 5){
                        break;
                    }

                }


            }

            public static void Check_Balance(){
                System.out.println("Current Balance: " +amount);
            }


            public static void Deposit_Money(){

                System.out.print("Enter the Amount: ");
                double Deposit = get.nextDouble();

                if(Deposit > 0){
                    amount += Deposit;
                    System.out.println("Your amount has been Successfully credited");

                }else{
                    System.out.println("Enter the valid amount");
                }

            }


            public static void Withdraw_Money(){
                System.out.print("Enter the amount: ");
                double withdraw = get.nextDouble();
                if(withdraw > 0 && withdraw <=amount){
                    amount-=withdraw;
                    System.out.println("Your amount has been successfully debited ");
                }else{
                    System.out.println("Enter the valid amount");
                }

            }
            public static void Change_PIN(){
                System.out.print("Enter the old PIN: ");
                int Pin_checking = get.nextInt();

                if(Pin_checking == UserDB){
                    System.out.print("Enter the new Pin: ");
                    int new_pin = get.nextInt();
                    UserDB = new_pin;
                    System.out.println("Your Pin number is changed successfully");
                }else{
                    System.out.println("Pin number is Invalid!");
                }
            }
            public static void Exit(){
                System.out.println("Exit");
            }

            public static void main(String[] args){


                for(int i=1; i<=3; i++){

                    System.out.print("Enter the PIN: ");
                    int UserPin = get.nextInt();

                    if(UserPin > 0){

                        if(UserPin == UserDB){
                            ShowMenu();
                            break;
                        }else{
                            System.out.println("Incorrect PIN");
                        }
                    }else{
                        System.out.println("Enter the valid PIN Number ");
                    }

                    if(i == 3){
                        System.out.println("Your 3 attempt is done.");
                    }

                }

            }
        }
