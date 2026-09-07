
public class CountCharacters {

    public static void main(String[] args) {

        String str = "Automation";

        int count = 0;

        for (char words : str.toCharArray()) {
            count++;
        }

        System.out.println("Total character is: " + count);

    }
}
