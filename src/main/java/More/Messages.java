package More;

import java.util.Scanner;

public class Messages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=countLetters ; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());

            String numberAsText=Integer.toString(inputNumber);
            int digitCount= numberAsText.length();
            int mainDigit= inputNumber%10;
            int offSet= (mainDigit -2) *3;


            if (mainDigit ==8 ||mainDigit==9 ){
                offSet++;
            }

            int letterIndex= offSet+digitCount-1;

            if (inputNumber==0){
                System.out.print(" ");
            }else {
                System.out.print((char)(letterIndex +97));
            }

        }

    }
}
