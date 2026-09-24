
public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        String Input = "Automation selenium".toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < Input.length(); i++) {

            char ch = Input.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch != ' ') {     // ignore space 
                consonantsCount++;
            }
        }

        System.out.println(vowelsCount);
        System.out.println(consonantsCount);

    }

}
