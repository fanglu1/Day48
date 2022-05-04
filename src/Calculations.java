import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = math.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = math.nextDouble();

        System.out.println(num + " + " + num2 + " = " + (num + num2));
        System.out.println(num + " - " + num2 + " = " + (num - num2));
        System.out.println(num + " * " + num2 + " = " + (num * num2));
        System.out.println(num + " / " + num2 + " = " + (num / num2));
        System.out.println(num + " % " + num2 + " = " + (num % num2));
    }
}
