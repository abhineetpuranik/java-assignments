public class Q9 {
    static long fact(int n){
        if(n==0){
            return 1;
        }else{
            return (n*fact(n-1));
        }    
    }
    public static void main(String[] args) {
        int num=12;
        System.out.println("Factorial of " + num + " is " + fact(12));
    }

}
   

