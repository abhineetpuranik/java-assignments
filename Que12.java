import java.util.Scanner;
public class Que12 {
    void app(){
        int m,p,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Maths Marks: ");
        m=sc.nextInt();
        System.out.println("Physics Marks: ");
        p=sc.nextInt();
        System.out.println("Chemistry Marks");
        c=sc.nextInt();
        if((m>=60 && p>=50 && c>=40 && (m+p+c)>=200) || (m+p)>=150){
            System.out.println("Candidate accepted");
        }else{
            System.out.println("Candidate not accepted");
        }
    }
    public static void main(String[] args) {
        Que12 a1=new Que12();
        a1.app();
    }
}

