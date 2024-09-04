import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter range of natural numbers:");
        int r=sc.nextInt();
        int sum=0;
        for(int i=0; i<=r;i++){
            sum+=i;
        }
        System.out.println("Sum of natural numbers upto "+ r + " is " + sum);
    }   
   
    
}
