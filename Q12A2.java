class Distance {
    protected double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double speedInMph = 60.0;
        double timeInHours = distanceInMiles / speedInMph;
        System.out.printf("Travel time in miles: %.2f hours (at %,.0f miles per hour)%n", timeInHours, speedInMph);
    }
}

class DistanceMKS extends Distance {

    public DistanceMKS(double distanceInKm) {
        super(distanceInKm * 0.621371);
    }

    @Override
    public void travelTime() {
        double speedInKph = 100.0;
        double timeInHours = (distanceInMiles / 0.621371) / speedInKph; 
        System.out.printf("Travel time in kilometers: %.2f hours (at %,.0f kilometers per hour)%n", timeInHours, speedInKph);
    }
}

public class Q12A2 {
    public static void main(String[] args) {
        Distance distanceInMiles = new Distance(180); 
        System.out.println("Base Class Output:");
        distanceInMiles.travelTime();

        DistanceMKS distanceInKm = new DistanceMKS(180);
        System.out.println("\nDerived Class Output:");
        distanceInKm.travelTime();
    }
}
