import java.util.Scanner;

public class LoginChecking{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the Username: ");
        String Username = get.nextLine();

        System.out.print("Enter the Password: ");
        int Password = get.nextInt();

        String StoredUserName = "admin";

        if(StoredUserName.equals(Username) ){
            if(Password == 123){
                System.out.println("Login Successfull");
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid username");
        }
        get.close();
    }
}