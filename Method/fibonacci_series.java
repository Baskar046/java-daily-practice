import java.util.Scanner;

public class fibonacci_series{

    public static void Fibonacci_series(int number){

        int num_1 = 0;
        int num_2 = 1;

        if (number >=1) {

            for (int i = 1; i <= number; i++) {

                System.out.println(num_1);      // Print before calculation starts

                int n3 = num_1 + num_2;
                num_1 = num_2;
                num_2 = n3;

            }
        }else{
            System.out.println("Enter the positive number ");
        }
    }

    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int number = get.nextInt();

        Fibonacci_series(number);

    }


}

/*
| Iteration (`i`) | `n1` (Before Print) | Printed | `n3 = n1 + n2` | `n1 = n2` | `n2 = n3` |
| :-------------: | :-----------------: | :-----: | :------------: | :-------: | :-------: |
|     Initial     |          0          |    -    |        -       |     -     |     1     |
|        1        |          0          |  **0**  |   `0 + 1 = 1`  |     1     |     1     |
|        2        |          1          |  **1**  |   `1 + 1 = 2`  |     1     |     2     |
|        3        |          1          |  **1**  |   `1 + 2 = 3`  |     2     |     3     |
|        4        |          2          |  **2**  |   `2 + 3 = 5`  |     3     |     5     |
|        5        |          3          |  **3**  |   `3 + 5 = 8`  |     5     |     8     |

 */