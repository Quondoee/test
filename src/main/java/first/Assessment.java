package first;

import java.util.Random;
import java.util.Scanner;

public class Assessment {
    public static void printOrder(getPrice + tipPercentage){

        Scanner scanner = new Scanner (System.in);

        System.out.println("is it true or false that your order is to go");
        boolean toGo = scanner.nextBoolean();

        System.out.println("what type of burger do you want today? cheese , ham or turkey?");
        String burgerType = scanner.next();

        System.out.println("please enter a tip amount of 0% , 5% , 10% , 15% or 20% tip!");
        double tipPercentage = scanner. nextInt();

        System.out.println("what is the name for your order?");
        String name = scanner.nextLine();

        int totalPrice = getPrice + tipPercentage;
        System.out.println();
        scanner.close();

    }

    public static char[] printsizes(char []sizes){


        return  sizes;
    }

    public static String printFullName (  String first ,String  last ){

        return first + " " + last;
    }
    public static int getPrice(int price){

        int min = 5;
        int max = 15;
        Random random = new Random();
        int randomnum = random.nextInt((max -min) + 1) + min;
        return price = randomnum;
    }
    public static void main(String[] args) {
        String first = "Dayquon";
        String last = "Kelley";
        char[] sizes = {'S','M','l'};
        final int EXPERATIONDATE = 10;
        System.out.println(printFullName(first , last));
        System.out.println(getPrice(10));
        System.out.println(printsizes(sizes));
    }
}
