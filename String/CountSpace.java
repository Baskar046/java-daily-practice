
public class CountSpace {

    public static void main(String[] args) {

        String Input = "Java is easy to learn";

        int count = 0;

        for (int i = 0; i < Input.length() - 1; i++) {

            char ch = Input.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }

        System.out.println(count);

    }

}
