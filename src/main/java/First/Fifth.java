package First;

import java.util.Scanner;

public class Fifth {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner scanner= new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int startNumber=number;
        int sumFact=0;

        while (number>0){
            int lastDigit=number%10;
            int factorial= 1;
            for (int i = 1; i<=lastDigit; i++ ) {
                factorial=factorial*i;
            }

            sumFact+=factorial;

            number=number/10;
        }

        if (startNumber==sumFact) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
