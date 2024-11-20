class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class Q24A2 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Name and age must be provided.");
            }
            
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age > 45) {
                throw new TooOlder("Candidate is too old.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young.");
            } else {
                System.out.println("Eligible candidate: " + name);
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a valid integer for age.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
