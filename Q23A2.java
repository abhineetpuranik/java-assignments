class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class Q23A2 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Temperature not provided.");
            }

            int temperature = Integer.parseInt(args[0]);

            if (temperature > 35) {
                throw new TooHot("Temperature too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature too cold!");
            } else {
                System.out.println("Normal temperature.");
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}