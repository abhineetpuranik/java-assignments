import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature");
        double t= sc.nextDouble();
        System.out.println("Celsius or Fahrenheit? (C/F)");
        char d= sc.next().charAt(0);
        if(d=='C' || d=='c'){
            double f= 9/5*(t+32);
            System.out.println("Temperature from Celsius to Fahrenheit:"+ f);
        }else{
            double c= 5/9*(t)+32;
            System.out.println("Temperature from Fahrenheit to Celsius:" + c);
        }        
    }

        
}
