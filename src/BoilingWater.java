import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater that 212: ");
   double number = scanner.nextDouble();
    if (number > 212) {
        System.out.println("Water is boiling!");
    }
}
}

