
public class SplitByCamelCase {

    public static void main(String[] args) {

        String str = "AutomationTesting";

        String[] words = str.split("(?=[A-Z])");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
