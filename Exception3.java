import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a frist number");
        var num1 = input.nextInt();
        System.out.println("Input a second number");
        var num2 = input.nextInt();
        try {
            System.out.println(num1 + " / " + num2 + " = " + ((num1 / num2) + (num1 % num2)));
        } catch (ArithmeticException e) {
            System.out.println("Divider cannt be 0");
        }

    }
}