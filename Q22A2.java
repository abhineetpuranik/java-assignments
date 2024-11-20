class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class NegativeValueException extends ArithmeticException {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class Q22A2{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = -5;

            if (b == 0) {
                throw new DivideByZeroException("Division by zero is not allowed.");
            }
            if (c < 0) {
                throw new NegativeValueException("Negative value not allowed.");
            }
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (DivideByZeroException | NegativeValueException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
