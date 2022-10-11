package se.Lexicon;

public class Main {

    //First task NR 1
    //Print Hello and your name.
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("David!");

        // 2 test age and salory.
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

        // Task NR. 5
        // Storage a username and print it whit Hello username.

        System.out.println("Right in your username");
        String username = "David";
        System.out.println("Hello!" + username);


    }


}







