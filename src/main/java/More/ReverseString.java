package More;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String reverse="";

        for (int i = input.length()-1; i >=0 ; i--) {
            char currentSymbol = input.charAt(i);
            reverse+=currentSymbol;
        }

        System.out.println(reverse);
    }
}
