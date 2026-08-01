
import java.util.Scanner;

public class CountPrimeNumber{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        int count;   
        int store_num = 0;  

        for(int i=1; i<=num; i++){  // outer loop manage user input number
            count = 0;  // Each time count gets 0
            for(int j=1; j<=i; j++){    //inner manages the factor divisibility
                if(i%j==0){     
                    count++ ;   
                }
            }
            if(count == 2){     // When count gets equal to two
                store_num++ ;   // store num increases one time 

            }

        }
        System.out.println(store_num);

    }
}