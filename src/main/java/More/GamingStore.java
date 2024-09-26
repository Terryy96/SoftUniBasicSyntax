package More;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String game= "";
        boolean isBought=false;
        double price = 0;
        double spent=0;

        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                price = 39.99;
                game= "OutFall 4";
                isBought=true;
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                game= "CS: OG";
                isBought=true;

            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                game= "Zplinter Zell";
                isBought=true;

            } else if (input.equals("Honored 2")) {
                price = 59.99;
                game= "Honored 2";
                isBought=true;

            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                game= "RoverWatch";
                isBought=true;

            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                game= "RoverWatch Origins Edition";
                isBought=true;

            } else {
                System.out.println("Not Found");
                isBought=false;

            }
            if (balance < price) {
                System.out.println("Too Expensive");
                isBought=false;
                input = scanner.nextLine();
                continue;
            }

            // Purchise
            balance-=price;
            spent+=price;
            if (isBought){
                System.out.printf("Bought %s%n", game);
            }

            input = scanner.nextLine();

        }
        if (balance <= 0) {
            isBought=false;
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, Math.abs(balance));
        }
    }
}