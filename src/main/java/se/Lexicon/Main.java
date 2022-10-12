package se.Lexicon;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        //First task NR 1
        //Print Hello and your name.

        System.out.println("hello");
        System.out.println("David!");

        // test of age and salory.

        int age = 20;
        System.out.println("age " + age);

        double salory = 3000.00;
        System.out.println("salory" + salory);


        // A test if you awnser depends on what number you put in testage value.
        // If below 18 you get a different awnser.

        int testage = 20;
        if (testage >= 18) {
            System.out.println("You can drive a car");
        } else {
            System.out.println("You can't drive the car");
        }

        //task NR. 2 Is it leapyear?
        //Variable definition and assignment

        int year = 2015;
        boolean leap = false;
        Scanner obj = new Scanner(System.in); /* create a object */

        //Remove comments from the bottom lines to take input from the user
        //System.out.print("Enter a year: ");
        //year = obj.nextInt();

        //A year divisible by 4 is a leap year
        if (year % 4 == 0) {

            //It is a centenary year if the value is divisible by 100 with no remainder.
            if (year % 100 == 0) {

                //Centenary year is a leap year divided by 400
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }
        //The Year is not a leap year
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");


        //task NR.3 ( small calculatior )
        // This is a simpel calculator whit +,-,/,*
        // That you as the operatior can youreself make the inputs.

        double n1 = 24, n2 = 6, result = 0;
        char operatior = '/';

        switch (operatior) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case '*':
                result = n1 * n2;
            default:
                System.out.println("operatior  is not valid!");
        }
        System.out.println(result);

        //Task NR. 4
        //average on 3 different numbers.


        double number1 = 2, number2 = 16, number3 = 4, res = 0;
        res = number1 + number2 + number3;
        System.out.println(res / 3);

        //Task NR. 5 Storage a username and print it whit Hello username.


        System.out.println("Right in your username");
        String username = "David";
        System.out.println("Hello!" + username);


        // Task NR. 6
        //a basic calculatior whit custum inputs.
/*
        System.out.println("Welcome to my app!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1");
        double t1 = scan.nextInt();
        System.out.println("Enter number2");
        double t2 = scan.nextInt();
        BasicCalculator.displayMeny();
        char opperation = scan.next().charAt(0);

        switch (opperation){
            case '+':
                double resultt = BasicCalculator.addition(t1, t2);
                System.out.println(resultt);
                break;
            case'-':
                double resu = BasicCalculator.subtraction(t1, t2);
                System.out.println(resu);
            case'*':
                double re = BasicCalculator.dulti(t1, t2);
                System.out.println(re);
            case'/':
                double r = BasicCalculator.devid(t1, t2);
                System.out.println(r);

        }
*/


        // Task 7 7. Create a program that converts seconds to hours, minutes and seconds Input seconds: 86399 Expected output: 23:59:59
       // needed to make a input
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
       //This is how many seconds the user put in the console
        int seconds = in.nextInt();
       // int = to storage the value of Seconds
        int S = seconds % 60; // calculate how many seconds that don't add upp to a full minute
        int H = seconds / 60; // seconds to Hour
        int M = H % 60;       // calculate how many minutes that don't add upp to a full hour
        H = H / 60;
        //H=hour,M=minutes,S=second
        System.out.print( H + ":" + M + ":" + S);
        System.out.print("\n");



    }
}







