
public class CountNum {

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -2, 0, 43, 0,};

        int positive_num = 0;
        int negative_num = 0;
        int zero_num = 0;

        for (int numbers : arr) {
            if (numbers > 0) {
                positive_num++;
            } else if (numbers < 0) {
                negative_num++;
            } else {
                zero_num++;
            }
        }

        System.out.println("Positive Numbers: " + positive_num);
        System.out.println("Negative Numbers: " + negative_num);
        System.out.println("Zero's: " + zero_num);
    }
}
