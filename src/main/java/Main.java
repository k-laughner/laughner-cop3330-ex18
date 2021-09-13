/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter C to convert from Fahrenheit to Celsius or enter F to convert from Celsius to Fahrenheit:");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        double f;
        double c;

        if (choice.equals("C")||choice.equals("c")){
            System.out.println("You selected: C");
            System.out.println("Enter the temperature in Fahrenheit:");
            Scanner input2 = new Scanner(System.in);
            f = input2.nextDouble();
            c = (f-32)*5/9;
            System.out.printf("The temperature in Celsius is %.2f degrees.", c);
        }
        else if (choice.equals("F")||choice.equals("f")) {
            System.out.println("You selected: F");
            System.out.println("Enter the temperature in Celsius:");
            Scanner input3 = new Scanner(System.in);
            c = input3.nextDouble();
            f = (c*9/5)+32;
            System.out.printf("The temperature in Fahrenheit is %.2f degrees.", f);
        }
        else{
            System.out.println("You entered an invalid choice.");
        }
    }
}