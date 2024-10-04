public class Que24 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int s=0, avg;
        for(int i=0;i< a.length;i++){
            s=s+a[i];
        }
        avg=s/a.length;
        System.out.println("Sum is: " + s);
        System.out.println("Average is: " + avg);
    }
}
