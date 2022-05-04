import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = scanner.nextDouble();
        if (num == num2) {
            System.out.println("Numbers are the same.");
        } else if (num > num2) {
            System.out.println("The first number is larger than the second number.");
        }
        else {
            System.out.println("The second number is larger than the first number.");
        }
    }
}