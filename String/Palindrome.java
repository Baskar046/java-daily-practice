public class Palindrome {

    public static void main(String[] args){

        String Input = "madam";

        String check ="";


        for(int i=Input.length()-1; i>=0; i--){
            check = check + Input.charAt(i);
        }

        if(Input.equals(check)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

}
