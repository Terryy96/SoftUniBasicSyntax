package First;

import java.util.Scanner;

public class Second {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());


        if (n%10==0){
            System.out.printf("The number is divisible by %d", 10);
        }else if (n%7==0){
            System.out.printf("The number is divisible by %d", 7);
        }else if (n%6==0){
            System.out.printf("The number is divisible by %d", 6);
        }else if (n%3==0){
            System.out.printf("The number is divisible by %d", 3);
        }else if (n%2==0){
            System.out.printf("The number is divisible by %d", 2);
        }else{
            System.out.println("Not divisible");
        }
    }
}
