import java.util.Scanner;
public class Que6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int y=sc.nextInt();
        int t=0;
        if (y%4==0){
            t=1;
            if(y%100==0){
                if(y%400==0){
                    t=1;
                }else{
                    t=0;
                }
            }
        }
        if(t==0){
            System.out.println("Not a Leap Year");
        }else{
            System.out.println("Leap Year!");
        }
    }
}