import java.util.Scanner;
public class Que21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter (1) for Binary to Decimal or (2) for Decimal to Binary: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binary = scanner.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal: " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: " + binary);
        }
    }
}
