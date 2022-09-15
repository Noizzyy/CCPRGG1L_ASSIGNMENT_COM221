import java.util.Scanner;

public class AppOrder {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nHello may I have your orders\n");

        System.out.print("What is your first order? ");
        String firstOrder = scan.next();
        System.out.print("How much does it cost? ");
        double priceOne = scan.nextDouble();

        System.out.print("\nWhat is your second order? ");
        String secondOrder = scan.next();
        System.out.print("How much does it cost? ");
        double priceTwo = scan.nextDouble();

        System.out.print("\nWhat is your third order? ");
        String thirdOrder = scan.next();
        System.out.print("How much does it cost? ");
        double pricethree = scan.nextDouble();

        double totalOrderPrice = priceOne + priceTwo + pricethree;

        System.out.println("\nYour orders:\n" + priceOne + "\n" + priceTwo + "\n" + pricethree + "\nTotal Price: " + totalOrderPrice);

        // Close scanner
        scan.close();
    }
}
