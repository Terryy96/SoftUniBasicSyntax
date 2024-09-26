package First;

import java.util.Scanner;

public class Seventh {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scanner= new Scanner(System.in);
        int orders=Integer.parseInt(scanner.nextLine());
        double priceCoffe=0;
        double priceTotal=0;


        for (int i=1; i<=orders; i++) {
            double price= Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsulesCount=Integer.parseInt(scanner.nextLine());
            priceCoffe=price*days*capsulesCount;
            priceTotal+=priceCoffe;
            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffe);
        }

        System.out.printf("Total: $%.2f", priceTotal);
    }
}
