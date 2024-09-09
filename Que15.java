import java.util.Scanner;
public class Que15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for finding table: ");
        int n=sc.nextInt();
        for(int i=0;i<=(n*10);i++){
            if(i%n==0){
                System.out.print(" "+ i + " ");
            }
        }
    }
}
