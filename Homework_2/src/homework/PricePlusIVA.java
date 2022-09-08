package homework;
import java.util.Scanner;

public class PricePlusIVA {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the amount");
        double amount = keyboard.nextDouble();
        double totalAmount = iva(amount);
        System.out.println("The total price is " + totalAmount);

    }

    static double iva (double price){
        return price + (price * 0.16);
    }

}
