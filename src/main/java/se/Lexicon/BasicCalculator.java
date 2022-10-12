package se.Lexicon;

public class BasicCalculator {
    public static double addition(double num1, double num2) {

        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {

        return num1 - num2;
    }
    public static double dulti(double num1, double num2) {

        return num1 * num2;
    }
    public static double devid(double num1, double num2) {

        return num1 / num2;
    }
    public static void displayMeny() {

        System.out.println("Menu for operation Enter one");
        System.out.println("+ - / *");

    }

    public static void main(String[] args) {
        System.out.println(BasicCalculator.addition(10, 20));
    }


}