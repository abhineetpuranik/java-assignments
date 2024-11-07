import java.util.Arrays;
public class Que22{
    public static double findMedian(int[] n) {
        Arrays.sort(n);
        int l = n.length;
        if (l % 2 == 0) {
            // If even, average the two middle numbers
            return (n[l / 2 - 1] + n[l / 2]) / 2.0;
        } else {
            // If odd, return the middle number
            return n[l / 2];
        }
    }

    public static void main(String[] args) {
        int[] n = {5,2,7,9,12,15};
        double median = findMedian(n);
        System.out.println("The median is: " + median);
    }
}
