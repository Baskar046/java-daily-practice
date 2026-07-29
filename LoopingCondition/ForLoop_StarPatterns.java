public class ForLoop_StarPatterns {

    public static void main(String[] args) {

        System.out.println("Square");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        Output:

        * * * 
        * * * 
        * * * 
    
        */

        System.out.println("\nRight Triangle");

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

                /*
        Output:

        * 
        * * 
        * * * 
    
        */
    }
}