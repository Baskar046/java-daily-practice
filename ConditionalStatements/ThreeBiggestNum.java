import java.util.Scanner; 

class ThreeBiggestNum{
public static void main(String[] args) {
    Scanner get = new Scanner(System.in);

    int a = get.nextInt();
    int b = get.nextInt();
    int c = get.nextInt();

    if (a >= b && a >= c) {
        IO.println(a + " is biggest number");
    } else if (b >= a && b >= c) {
        IO.println(b + " is biggest number");
    } else {
        IO.println(c + " is biggest number");
    }
    get.close();
}
}
