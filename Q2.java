import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println(n+ " is positive");
        }else{
            System.out.println(n+ " is negative");
        }
    }
}
