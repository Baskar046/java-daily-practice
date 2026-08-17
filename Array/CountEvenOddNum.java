import java.util.Scanner;

public class CountEvenOddNum {

    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = get.nextInt();

        int[] arr = new int[size];

        int even_count = 0;
        int odd_count = 0;


        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the elements: ");
            arr[i]= get.nextInt();
        }

        for(int numbers: arr){
            if(numbers%2==0) {
                even_count++;
            }else{
                odd_count++;
            }
        }

        System.out.println("Even: " + even_count);
        System.out.println("Odd: " + odd_count);

    }
}