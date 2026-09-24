
public class CountSpecialCharacter {

    public static void main(String[] args) {

        String Input = "Java@123#";

        int count = 0;

        for (int i = 0; i < Input.length(); i++) {
            char ch = Input.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch) || ch != ' ') {
                continue;
            } else {
                count++;
            }
        }

        System.out.print("Number of Special Character: " + count);

    }

}
