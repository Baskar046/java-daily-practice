
public class ReverseString {

    public static void main(String[] args) {

        String Input = "Java";

        for (int i = Input.length() - 1; i >= 0; i--) {
            System.out.print(Input.charAt(i));
        }

    }

}
