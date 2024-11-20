public class Q20A2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[-1]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught NegativeArrayIndexException: " + e.getMessage());
        }
        
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}