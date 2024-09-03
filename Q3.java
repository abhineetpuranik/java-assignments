public class Q3{
    public static void main(String[] args){
        int a=5;
        int b=6;
        int c=7;
        int max;
        if (a>=b && a>=c){
            max=a;
        }else if (b>=a && b>=c) {
            max=b;
        }else{
            max = c;
        }
        System.out.println("Maximum number is " + max);
    }
}