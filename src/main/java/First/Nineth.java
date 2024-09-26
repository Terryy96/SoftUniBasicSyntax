package First;

import java.util.Scanner;

public class Nineth {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scanner= new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice= Double.parseDouble(scanner.nextLine());
        double mousePrice= Double.parseDouble(scanner.nextLine());
        double keyboardPrice= Double.parseDouble(scanner.nextLine());
        double displayPrice= Double.parseDouble(scanner.nextLine());
        int countHeadset=0;
        int countMouse=0;
        int countKeyboard=0;
        int countDisplay=0;

        for (int i= 1; i<=lostGames ; i++ ) {
            if (i%2==0) {
                countHeadset++;
            }
            if (i%3==0) {
                countMouse++;
            }
            if (i%6==0){
                countKeyboard++;
            }

            if (i % 12 == 0) {
                countDisplay++;
            }
        }
        double totalExpenses= countHeadset*headsetPrice+countMouse*mousePrice+countDisplay*displayPrice+countKeyboard*keyboardPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
