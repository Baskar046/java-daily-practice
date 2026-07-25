import java.util.Scanner;

public class MarkPercentage{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        int mark = get.nextInt();

        if(mark <= 100 && mark >= 90){
            System.out.println("Grade A");
        }else if(mark <= 89 && mark >= 80){
            System.out.println("Grade B");
        }else if(mark <= 79 && mark >= 70){
            System.out.println("Grade C");
        }else if(mark <= 69 && mark >= 60){
            System.out.println("Grade D");
        }else if(mark >= 0 && mark < 60){
            System.out.println("Fail");
        }else{
            System.out.println("Invalid marks");
        }
        get.close();
    }
}
