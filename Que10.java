public class Que10 {
    static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int f=10;
        for(int i=0;i<f;i++){
            System.out.print(fib(i) + " ");
        }
    }
    
}
