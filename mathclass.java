public class mathclass{
     public static void main(String[] args){
        double degree=45.0;
        int a=8;
        double m1=Math.sqrt(a);
        System.out.println(m1);
        double m2=Math.cbrt(a);
        System.out.println(m2);
        double radians=Math.toRadians(degree);
        double sinVal= Math.sin(radians);
        double cosVal= Math.cos(radians);
        double tanVal= Math.tan(radians);
        System.out.println("sin(" + degree + ") = " + sinVal);
        System.out.println("cos(" + degree + ") = " + cosVal);
        System.out.println("tan(" + degree + ") = " + tanVal);
     }
}