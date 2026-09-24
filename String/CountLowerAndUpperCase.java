
public class CountLowerAndUpperCase {

    public static void main(String[] args) {

        String Input = "JaVa ProGRAMming";

        int UpperCaseCount = 0, LowerCaseCount = 0;

        for (int i = 0; i < Input.length(); i++) {
            char ch = Input.charAt(i);
            if (Character.isUpperCase(ch)) {
                UpperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                LowerCaseCount++;
            }
        }

        System.out.println("Number of UpperCase: " + UpperCaseCount);
        System.out.println("Number of LowerCase: " + LowerCaseCount);

    }

}
