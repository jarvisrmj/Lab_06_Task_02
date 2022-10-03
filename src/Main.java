import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double galNum = 0;
        double fuelEff = 0;
        double price = 0;
        double total = 0;
        double current = 0;
        String trash = "";


        System.out.print("Enter the amount of gas in your tank: ");
        if (in.hasNextDouble()) {
            galNum = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }


        System.out.print("Enter your fuel effenciency: ");
        if (in.hasNextDouble()) {
            fuelEff = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        System.out.print("Enter the price for gas: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }

        total = (100 / fuelEff) * price;
        System.out.println("The price for 100 miles will be " + total);

        current = galNum * fuelEff;
        System.out.println("You can currently go " + current + " With the amount of gas you have");
    }

}