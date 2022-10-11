package se.Lexicon;

public class Main {

    //First task NR 1.
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("David!");

        // 2 test age and salory
        int age = 20;
        System.out.println("age " + age);

        double salory = 3000.00;
        System.out.println("salory" + salory);

        // a test if you change testage from 20 to 10 you get the other message.
        int testage = 20;
        if (testage >= 18) {
            System.out.println("You can drive a car");
        } else {
            System.out.println("You can't drive the car");
        }

        //task NR.3 ( small calculatior )
        // This is a simpel calculator whit +,-,/,*
        // That you as the operatior can youreself make the inputs
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


    }


}







