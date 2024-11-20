class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class Q21A2 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Country name not provided.");
            }
            String country = args[0];
            String capital = getCapital(country);
            System.out.println("Capital of " + country + " is " + capital);
        } catch (NoMatchFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getCapital(String country) throws NoMatchFoundException {
        if (country.equalsIgnoreCase("USA")) {
            return "Washington, D.C.";
        } else if (country.equalsIgnoreCase("India")) {
            return "New Delhi";
        } else if (country.equalsIgnoreCase("Japan")) {
            return "Tokyo";
        } else if (country.equalsIgnoreCase("France")) {
            return "Paris";
        } else if (country.equalsIgnoreCase("Germany")) {
            return "Berlin";
        } else {
            throw new NoMatchFoundException("No match found for country: " + country);
        }
    }
}