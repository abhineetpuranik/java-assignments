class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class Q25A2 {
    public static void main(String[] args) {
        String username = "user";
        String password = "pass123";
        String confirmPassword = "pass1234";

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters.");
            }
            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Password does not match.");
            }
            System.out.println("User validated successfully.");
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}