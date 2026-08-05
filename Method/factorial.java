
public class factorial {

    public static int factorial(int number) {
        int factorial_no = 1;   // stores multiplied number.
        for (int i = 1; i <= number; i++) {
            factorial_no *= i; // multiply the numbers

        }
        return factorial_no;
    }

    public static void main(String[] args) {
        int result = factorial(5);  // send as 5 argument
        System.out.println(result);
    }
}
