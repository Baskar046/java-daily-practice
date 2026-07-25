/*

Electricity Bill

Units <=100 -> ₹0
101-200 -> ₹2/unit
201-300 -> ₹3/unit
Above 300 -> ₹5/unit

Calculate the bill.

The command multi line: IntelliJ IDEA & Eclipse: Ctrl + Shift + /

                        VS Code: Shift + Alt + A



*/


import java.util.Scanner;

public class ElectricityBill{
    public static void main(String[] args){

        Scanner get = new Scanner(System.in);

        int unit = get.nextInt();

        if(unit >= 0 && unit <= 100){
            System.out.println("Electricity Bill is " + 0); // Units <=100 -> ₹0
        }else if(unit >= 101 && unit <= 200){
            System.out.println("Electricity Bill is " + (unit - 100) * 2);  //  101-200 -> ₹2/unit
        }else if(unit >=201 && unit <= 300){
            System.out.println("Electricity Bill is " + (100 * 2 + (unit - 200) * 3));  // 201-300 -> ₹3/unit
        }else if(unit > 300){
            System.out.println("Electricity Bill is " + (100 * 2 + 100 * 3 + (unit - 300) * 5));  // Above 300 -> ₹5/unit
        }else{
            System.out.println("Invalid Unit");
        }
        get.close();
    }
}
