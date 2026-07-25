import java.util.Scanner;

public class FindLettersUppercase_Or_LowerCase {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        char value = get.next().charAt(0);

        if (value >= 'A' && value <= 'Z'){     // A = 65 to Z = 90 
            System.out.println("UPPERCASE");
        }else if( value >= 'a' && value <= 'z'){   // a = 97 to z = 122
            System.out.println("LOWERCASE");
        }else{
            System.out.println("Invalid input");
        }


    }
}
