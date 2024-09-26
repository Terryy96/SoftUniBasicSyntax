package First;

import java.util.Scanner;

public class Fourth {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner= new Scanner(System.in);
        int startN= Integer.parseInt(scanner.nextLine());
        int endN= Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i=startN; i<=endN; i++) {
            System.out.print(i + " ");
            sum+=i;

        }
        System.out.printf("%nSum: %d", sum);

    }
}
