
public class PrintEachCharacter {

    public static void main(String[] args) {

        String str = "java";

        /*
        
        charAt()
        
            Access the single character at the time. It's primitive data type.
            Cannot allocate memory space.
         */
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        String text = "String";

        /*
        
        toCharArray()
        
            Copies whole string and create new array string. It's non-primitive data type.
            Allocate memory space in heap.
         */
        for (char words : text.toCharArray()) {
            System.out.println(words);
        }


        /*
        Split()

            Split the words based charater boundary. 
         */
        for (String ch : str.split("")) {
            System.out.println(ch);
        }

    }

}
