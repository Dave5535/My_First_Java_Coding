package se.Lexicon;

public class Main {

    //First task NR 1.
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("David!");

        // 2 test age and salory
        int age= 20;
        System.out.println("age " + age);

        double salory = 3000.00;
        System.out.println("salory" + salory);

        // a test if you change testage from 20 to 10 you get the other message.
        int testage= 20;
        if (testage >= 18) {
            System.out.println("You can drive a car");
        }else {System.out.println("You can't drive the car");

        //Task NR 2 Is it a leap_year?
            // if year is divisible by 400 then is_leap_year
            //else if year is divisible by 100 then not_leap_year
            //else if year is divisible by 4 then is_leap_year
            //else not_leap_year

            int leapyear= 400;
            if (leapyear / 400) {System.out.println("yes it was leapyear" + leapyear);

            } else if (leapyear / 100) {System.out.println("It was not a leapyear" + leapyear);

            } else if (leapyear / 4) {System.out.println("Yes it was leapyear" + leapyear);

            } else {System.out.println("It was not a leapyear"+ leapyear);


        }


        }


