public class Que11 {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        System.out.println("Number is " + n);
        while (n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println("Reversed Number is "+ rev);
    }
}
