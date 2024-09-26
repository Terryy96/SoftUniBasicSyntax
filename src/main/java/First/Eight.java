package First;

import java.util.Scanner;

public class Eight {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scanner= new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        int countStudents=Integer.parseInt(scanner.nextLine());
        double priceSaber= Double.parseDouble(scanner.nextLine());
        double priceRobe= Double.parseDouble(scanner.nextLine());
        double priceBelt= Double.parseDouble(scanner.nextLine());

        double sumSabers=Math.ceil(countStudents+ countStudents*0.10)*priceSaber;
        double sumRobes=countStudents*priceRobe;
        double sumBelts=priceBelt*(countStudents- countStudents/6);
        double totalSum=sumBelts+sumRobes+sumSabers;

        if (budget>=totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else{
            double neededMoney=totalSum-budget;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
