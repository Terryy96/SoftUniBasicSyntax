package First;

import java.util.Scanner;

public class Third {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner= new Scanner(System.in);
        int numberOfPeople= Integer.parseInt(scanner.nextLine());
        String type =scanner.nextLine();
        String day =scanner.nextLine();
        double price=0;
        double totalPrice=0;

        switch(day){
            case "Friday":
                switch (type){
                    case "Students":
                        price=8.45;
                        break;
                    case "Business":
                        price=10.90;
                        break;
                    case "Regular":
                        price=15;
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        price=9.80;
                        break;
                    case "Business":
                        price=15.60;
                        break;
                    case "Regular":
                        price=20;
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        price=10.46;
                        break;
                    case "Business":
                        price=16;
                        break;
                    case "Regular":
                        price=22.50;
                        break;
                }
                break;
        }

        totalPrice=numberOfPeople*price;

        if(type.equals("Students") && numberOfPeople>=30){
            totalPrice=totalPrice-totalPrice*0.15;
        }else if(type.equals("Business") && numberOfPeople>=100){
            totalPrice=totalPrice-10*price;
        }else if(type.equals("Regular") && numberOfPeople>=10 && numberOfPeople<=20){
            totalPrice=totalPrice-totalPrice*0.05;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
