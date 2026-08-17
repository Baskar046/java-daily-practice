import java.util.Scanner;

public class SumOfnumbers {

    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = get.nextInt();

        int[] arr = new int[size];
        int total= 0;       

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the elements: ");
            arr[i]= get.nextInt();
        }

        for(int numbers: arr){
            total += numbers;       // get the elements from arr.
        }

        System.out.println(total);  // print total numbers

    }
}
