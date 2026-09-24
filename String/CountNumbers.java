
public class CountNumbers {

    public static void main(String[] args) {

        String Input = "Java123";

        int count = 0;

        for (int i = 0; i < Input.length(); i++) {
            char ch = Input.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        System.out.print("Number of digit: " + count);

    }

}
