import java.util.Scanner;
public class Que27{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n= sc.nextInt();
        int[] a= new int[n];   
        
        System.out.println("Enter " + n + " elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int smallest= a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
    }
}