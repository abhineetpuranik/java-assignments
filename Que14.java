import java.util.Scanner;
public class Que14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range: ");
        int r=sc.nextInt();
        for(int i=0;i<=r;i++){
            if(i%10==0){
                System.out.println(i);
            }
        }
        
    }
   
}
