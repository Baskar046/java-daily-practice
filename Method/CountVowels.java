import java.util.Scanner;

public class CountVowels {

    public static int vowelCount(String word){

        int count = 0;

        char[] chars = word.toCharArray();
        for(char ch: chars){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    Scanner get = new Scanner(System.in);

    System.out.print("Enter the sentence: ");
    String word = get.nextLine();

    int result = vowelCount(word);
    System.out.println("no.of vowels: " + result);

    }
}