import java.util.Scanner;
public class Que8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        double dn=sc.nextDouble();
        System.out.println("Enter Divisor: ");
        double dv=sc.nextDouble();
        if(dn%dv==0){
            System.out.println(dn+" is divisible by "+dv);
        }else{
            System.out.println("Not divisible");
        }
    }
}
