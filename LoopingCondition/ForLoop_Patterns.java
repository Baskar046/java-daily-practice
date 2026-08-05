
public class ForLoop_Patterns {

    public static void main(String[] args) {

        System.out.println("Square");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
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
        System.out.println("\nRow Number");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");      // Ith row, Jth column
            }
            System.out.println();
        }

        /*
        Output:

        1 1 1 1
        2 2 2 2
        3 3 3 3
        4 4 4 4

         */
        System.out.println("\nRow Number");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");      // Ith row, Jth column
            }
            System.out.println();
        }

        /*
        Output: 

        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4

         */

        System.out.println("\nRow Number");

        int count = 0;

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                count +=1;
                System.out.print(count);
            }
            System.out.println();

        }

        /*
        
        Output:

        123
        456
        789

        */


        System.out.println("\n coordinates");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        /*
        Output:

        (1,1) (1,2) (1,3)
        (2,1) (2,2) (2,3)
        (3,1) (3,2) (3,3)

         */
        System.out.println("\n Number Patterns");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
        Output: 

        1
        2 2
        3 3 3
        4 4 4 4

         */
        System.out.println("\n Triangle Patterns");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Output:

        *****
        ****
        ***
        **
        *
        
         */
        System.out.println("\n Triangle Patterns");
        for (int i = 1; i <= 5; i++) {      // handle row
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");      // Print space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");      // print star
            }
            System.out.println();
        }

        /*
        Output:
        
            *
           **
          ***
         ****
        *****

         */
        System.out.println("\n Triangle Patterns");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
        Output:

        *****
         ****
          ***
           **
            *
         */
        System.out.println("\n  Pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 4; k++) {
            for (int l = 4; l >= k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Output:

            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
            
        */

    }
}
