
public class CountVowels {

    public static void main(String[] args) {

        String Input = "Automation".toLowerCase();

        char[] regex = Input.toCharArray();

        int count = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < regex.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (regex[i] == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
