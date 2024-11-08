import java.util.Scanner;

class Commission {
    int sales;
    Commission(int v) {
        sales = v;
    }
    int commission() {
        return (sales * 10) / 100;
    }
}

public class Que33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Value: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Input!");
        } else {
            Commission o1 = new Commission(n);
            int ComAmount = o1.commission();
            System.out.println("The commission is: " + ComAmount);
        }
    }
}
