import java.util.Scanner;
public class Q17A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.next();

        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            String consecutiveDigits = number.substring(i, i + 2);
            sum += Integer.parseInt(consecutiveDigits);
        }

        System.out.println("Sum: " + sum);
    }
}
