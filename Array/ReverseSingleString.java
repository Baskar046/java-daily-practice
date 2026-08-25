
import java.util.Arrays;

public class ReverseSingleString {

    public static void main(String[] args) {
        String str = "hello";

        char[] s = str.toCharArray();
        char[] reversed = new char[s.length];

        int j = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            reversed[j] = s[i];
            j++;
        }
        System.out.print(Arrays.toString(reversed));

    }
}
