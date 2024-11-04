public class exception4 {
    public static void main(String[] args) {
        try {
            int data=25/5;
            System.out.println("Value of data is: "+ data);
        } catch (ArithmeticException e) {System.out.println(e);}
        finally{System.out.println("finally block always executed");}
        System.out.println("rest of the code...");
    }   
}
