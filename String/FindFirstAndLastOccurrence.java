
public class FindFirstAndLastOccurrence {

    public static void main(String[] args) {

        String str = "Programming";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            if ('g' == str.charAt(i)) {
                System.out.println("First occurrence: " + i);
                break;
            }
        }

        for (int j = str.length() - 1; j >= 0; j--) {

            if ('g' == str.charAt(j)) {
                System.out.println("Last Occurrence: " + j);
                break;
            }
        }

    }
}
