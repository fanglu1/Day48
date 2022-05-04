import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100.");
        double num = scanner.nextDouble();
        if (num <= 100 && num >= 90) {
            System.out.println("Your grade is an A!!");
        } else if (num < 90 && num >=80) {
            System.out.println("Your grade is a B!");
        }
        else if (num < 80 && num >=70) {
            System.out.println("Your grade is a C.");
        } else if (num < 70 && num >=60) {
            System.out.println("Your grade is a D.");
        }
        else {
            System.out.println("You failed. Go study some more.");
        }
    }
}
