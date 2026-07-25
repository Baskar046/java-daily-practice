import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        int a = get.nextInt();
        int b = get.nextInt();
        int count =0;

        for(int i=a; i<=b; i=i+1){
            if(i%2==0){
                count = count+1;
            }
        }
        System.out.print(count);
    }
}
